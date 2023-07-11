SUMMARY = "A modular transport and protocol neutral RPC library"
DESCRIPTION = "There are a number of jsonrpc libraries already out there on PyPI, \
most of them handling one specific use case (e.g. JSON via WSGI, \
using Twisted, or TCP sockets). \
 \
None of the libraries, however, made it easy for the author of \
TinyRPC to reuse the jsonrpc-parsing bits and substitute a different \
transport (i.e. going from json via TCP to an implementation using \
WebSockets or ZeroMQ)."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "python311-tinyrpc-1.1.6-1.3.noarch.rpm"
RPM_HASH = "5adbc9549f415cab7dfcffa791c4f92ca96dd2c1ee1aaac4104b31671f9ceeb5deac66670e6f0245fa1d35c72acef17e4393d1181463d2e8f42356ff9204583a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyrpc \
python3.11dist-tinyrpc \
python311-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
