SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python39-Glymur-0.11.3-1.6.noarch.rpm"
RPM_HASH = "b56b795ed396f87cc92652e283f6729d3601ccd5b934cece46d894d559c02237c2191c602b19f97e3ea0607dd4f4b06c69a320454e74f6fa7341547597f5a985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-glymur \
python39-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-lxml \
python39-numpy \
python39-packaging \
update-alternatives"

inherit rpm
