SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-async_timeout-4.0.2-3.3.noarch.rpm"
RPM_HASH = "7e4f566295ccbde5016500e64761299a2ff38183784161828a9f3a21c986efc0c2f8865e1c926947709897456c2f5d6fc04ebb599b54b17f1b3c03ec6c15c35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-timeout \
python3.11dist-async-timeout \
python311-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
