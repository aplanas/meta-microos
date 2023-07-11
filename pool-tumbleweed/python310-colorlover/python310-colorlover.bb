SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-colorlover-0.3.0-1.16.noarch.rpm"
RPM_HASH = "4b334985bcd8712923751716d1d47b4836927a87279d4556f8f330ddbebf5fa28464b1822f6ca849eca49e3f076d15553b5afdd03370a07a944dc74f34c82f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colorlover \
python310-colorlover \
python3dist-colorlover"

RDEPENDS:${PN} += "python-abi"

inherit rpm
