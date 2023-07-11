SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-ajsonrpc-1.2.0-2.6.noarch.rpm"
RPM_HASH = "62a58025c0cac3147725c5563f3b0a14f760f83506e9773b4a0ad575aee1d8836573ad896061796530854c852ae710287c359082bcfeb3772aa8dee38f8e6ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ajsonrpc \
python39-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
