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

RPM_NAME = "python39-imagesize-1.4.1-2.3.noarch.rpm"
RPM_HASH = "f86b0331a271cbfec4e7a722dc8d8dbdceca0a49c422716f722b0adab560d06d4ce01724686b8406eb947040fd15ae2b7e46c43a87c251f9c84fe97ecb8eee87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imagesize \
python39-imagesize \
python3dist-imagesize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
