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

RPM_NAME = "python39-tinyrpc-1.1.6-1.1.noarch.rpm"
RPM_HASH = "aa279a38bb6b040c726a7e44fa08a22dda50bf16947321b19f4cafee3ab7340240a1153780b485f5b04088f742eb3e06b305ebd77551aa11374f47fd50b2a1c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinyrpc \
python39-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
