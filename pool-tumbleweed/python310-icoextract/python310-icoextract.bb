SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-icoextract-0.1.4-1.5.noarch.rpm"
RPM_HASH = "d37b48b3fd4268f18670dcdc3c3c0d359928d0059b621f898c0535f319ec6171f081260c86ccd22a98c2799ce2a9109e3d93658106a1eb9f951d4640868aa3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-icoextract \
python310-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pefile \
update-alternatives"

inherit rpm
