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

RPM_NAME = "python310-imagesize-1.4.1-2.3.noarch.rpm"
RPM_HASH = "1770a90f2a8f60f53575b58bdd1ad773d6f008c1830131f6524abf8c32360432395424df294f690d3e097a3dfd8553d8987569026fab961f6f9456295179cd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-imagesize \
python310-imagesize \
python3dist-imagesize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
