SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python310-Glymur-0.11.3-1.4.noarch.rpm"
RPM_HASH = "e55515927b22bdbbe9d9d6cfc21e5c04ca539199aee9f94ae9163963ac784f17490a2f43046c9f2a9c9359063a3de2bc28c2d83fc90c250c7376178fd08e16d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Glymur \
python3.10dist-glymur \
python310-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-lxml \
python310-numpy \
python310-packaging \
update-alternatives"

inherit rpm
