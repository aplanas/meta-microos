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

RPM_NAME = "python310-tinyrpc-1.1.6-1.3.noarch.rpm"
RPM_HASH = "9b6b4623015c3192e7ad2a2ace1e0ae96109a9acdeeca1cbc34dc6ada27fb44dc66e25e3763dabc9e0df5099dcf374a5bedb391d4e3cdb575e6c62548c237021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tinyrpc \
python310-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
