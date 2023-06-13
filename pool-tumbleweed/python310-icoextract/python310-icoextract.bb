SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-icoextract-0.1.4-1.4.noarch.rpm"
RPM_HASH = "1f0c7dfc58e1da34b7a02712eafd38b50cf26c1f8946a176c18bfd245efcb82083c5bb0733d47ff3fec583134084f7c55a43b69a588bd816a702322987b032c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-icoextract \
python3.10dist(icoextract) \
python310-icoextract \
python3dist(icoextract)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-pefile \
update-alternatives"

inherit rpm
