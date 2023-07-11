SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-async_timeout-4.0.2-3.3.noarch.rpm"
RPM_HASH = "bf376a246b6dd6d15a6fadb0bd3a4c16803ed2a7bad9eacece5de743d036e6fffb3d15de01b5528dfa65ead29a62b3fb7e06360dc0429863328a01052d5dee61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-timeout \
python39-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
