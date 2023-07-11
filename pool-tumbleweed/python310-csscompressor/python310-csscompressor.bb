SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python310-csscompressor-0.9.5-3.1.noarch.rpm"
RPM_HASH = "3a5cbcda49c2ac0aafb97524fd5c9f7ef685cfccf0d4f0c9c0e0379ee14ebd1fa67a360adaffc2783b05385d46ca268c47159cb1d1fc8c7a990319fbccaa1973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-csscompressor \
python310-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
