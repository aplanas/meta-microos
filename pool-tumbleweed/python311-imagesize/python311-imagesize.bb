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

RPM_NAME = "python311-imagesize-1.4.1-2.3.noarch.rpm"
RPM_HASH = "1b12abe609ed2a498ca5d2bff4cbe10e1eade7925be4a315fb63bfff192f07bd943069da908b8f890b779431b543edb68c8ee24b1849fd806a5c264cd7548cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imagesize \
python3.11dist-imagesize \
python311-imagesize \
python3dist-imagesize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
