SUMMARY = "Getting image size from PNG/JPEG/JPEG2000/GIF files"
DESCRIPTION = "Pure Python library which parses image files' header and returns the image size. \
 \
Supported formats: \
 * PNG \
 * JPEG \
 * JPEG2000 \
 * GIF"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-imagesize-1.4.1-2.1.noarch.rpm"
RPM_HASH = "a3875877796f54d202469f7e98e8fab25e34849c829e188cb72a0ad55c2d65f65d5c5f93d6098d47eb62a87f5de6beffaa803675163423cda41e49655e1025ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imagesize \
python3.10dist-imagesize \
python310-imagesize \
python3dist-imagesize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
