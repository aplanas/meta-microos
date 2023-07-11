SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-ajsonrpc-1.2.0-2.6.noarch.rpm"
RPM_HASH = "95336e517d436f41cbfec56019912a5b8826b73cced2dcc25b4142aa719257af6838e1b9d9388e5e98fa09c0fdf1badbed711ce5971d3956f17d28424ef78427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ajsonrpc \
python3.11dist-ajsonrpc \
python311-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
