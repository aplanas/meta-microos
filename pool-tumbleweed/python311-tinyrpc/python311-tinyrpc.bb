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

RPM_NAME = "python311-tinyrpc-1.1.6-1.1.noarch.rpm"
RPM_HASH = "727cf9c7c53315a2989947a8ef435812ff241ce147421f7cea572df9dbfdaa856ce9a734b5951d0c97bea60781e9013482879d59c87aa6fc0d9717b3b9a241fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tinyrpc \
python311-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
