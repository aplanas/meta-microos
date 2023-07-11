SUMMARY = "Miscellaneous utils for asyncio"
DESCRIPTION = "Miscellaneous utils for asyncio."
LICENSE = "MIT"

PV = "17.3.0"

RPM_NAME = "python311-aiomisc-17.3.0-1.3.noarch.rpm"
RPM_HASH = "4aea2d8f03ac68120671d28d2f8f01d5da2055983dc5bd2bf3e937fb3984c4a83d6eaa2fd003cda4ee145a16328eef362138b9d5bcd564f536d5cb35d0ee6242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiomisc \
python3.11dist-aiomisc \
python311-aiomisc \
python3dist-aiomisc"

RDEPENDS:${PN} += "python-abi \
python311-colorlog \
python311-logging-journald"

inherit rpm
