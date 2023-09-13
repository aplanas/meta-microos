SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.3"

RPM_NAME = "python311-async_timeout-4.0.3-1.1.noarch.rpm"
RPM_HASH = "a3845114c7d3e736bd0b726082b2bc963f637bb3e115bad6e29994dbf2d3f25d81fd07030e0233dfd24fe5e99c2e24f0f952d8e89715fc47b9bf0c106cac1444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-timeout \
python3.11dist-async-timeout \
python311-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
