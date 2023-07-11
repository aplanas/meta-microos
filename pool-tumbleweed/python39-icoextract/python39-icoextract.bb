SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python39-icoextract-0.1.4-1.5.noarch.rpm"
RPM_HASH = "856c0b172c45ff6bb59c6afd7d8260a6096ee399d5ca50aa620ba8fdb6eabbece4839dfbe9e58fd3c79df36a40e459456bde969b4af1b5eb718d11a5582ea8c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-icoextract \
python39-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pefile \
update-alternatives"

inherit rpm
