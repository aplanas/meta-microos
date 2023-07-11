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

RPM_NAME = "python39-tinyrpc-1.1.6-1.3.noarch.rpm"
RPM_HASH = "8cd8eff5e1322b001ec8c3c8bcc204ba92b1cdeb201fe59141efbb1e798d96a1329a8931e5aa7c0c5cc4e533798b7cf9e90b946ef30e5a6eb24a68902d3919a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinyrpc \
python39-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
