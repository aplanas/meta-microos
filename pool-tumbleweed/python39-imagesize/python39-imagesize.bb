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

RPM_NAME = "python39-imagesize-1.4.1-2.1.noarch.rpm"
RPM_HASH = "c7b5eebdf3dea5883de4d66779d094eae6eb9e9c96b04cdaac4dd91c6e8f85d2cfe77fbe0eafdb5442f52ec0b05c5f0be9b431a4fc5d3c32c0397bbac9009af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(imagesize) \
python39-imagesize \
python3dist(imagesize)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
