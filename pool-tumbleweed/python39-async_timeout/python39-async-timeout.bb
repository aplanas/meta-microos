SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.3"

RPM_NAME = "python39-async_timeout-4.0.3-1.1.noarch.rpm"
RPM_HASH = "cd98d57767ac4668d6a1942e450d5c68d057cdbb530e316b87e5515922d2dc69326af3770fdc5a7b7442b3af40a98a65ab5aa9ac132cd6cdcf78787dbe1c38e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-timeout \
python39-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
