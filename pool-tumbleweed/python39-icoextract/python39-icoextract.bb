SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python39-icoextract-0.1.4-1.4.noarch.rpm"
RPM_HASH = "3776f1045d9e48b4fa400950014d365f7688e522da37eefedf465daf121ef433d9e1474441ab22b061bd52f825ad44566fe459edb4c27c835ab28739d929dfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-icoextract \
python39-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-pefile \
update-alternatives"

inherit rpm
