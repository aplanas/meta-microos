SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-ajsonrpc-1.2.0-2.4.noarch.rpm"
RPM_HASH = "3931fe7dc8ee38d9ba6bfcd4917aeecc23ecd44fbcacad31662342c8cedd6bc559fe84ec09f2eab841e8440927d8808aae031ad52665de6528d33ba9eecfa131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ajsonrpc \
python3.10dist-ajsonrpc \
python310-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi"

inherit rpm
