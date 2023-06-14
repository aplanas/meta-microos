SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-async_timeout-4.0.2-3.1.noarch.rpm"
RPM_HASH = "6aa51541d8b98446b5deb66e45ed6c98ddea433f4a439b7abf9698526ac132c4ef0344fc785ab8bb185ecb9780ef632016e876bb2e74ddcec2c9d96fa6869dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-async-timeout \
python311-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
