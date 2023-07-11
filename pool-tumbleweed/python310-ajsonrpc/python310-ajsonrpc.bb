SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-ajsonrpc-1.2.0-2.6.noarch.rpm"
RPM_HASH = "cd5f8f40e5b88b82d84b9ac08f569654e8a358842f511917b2c24fc7f51628c683c83909ee8618b50c457cabe5a72ffb52d18d915358479bba58b6e0b5c6e048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ajsonrpc \
python310-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
