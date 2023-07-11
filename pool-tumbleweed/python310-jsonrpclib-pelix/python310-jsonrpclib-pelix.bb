SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "0.4.3.2"

RPM_NAME = "python310-jsonrpclib-pelix-0.4.3.2-1.4.noarch.rpm"
RPM_HASH = "6f9785074f0979f1f4f3da1308fb3faa68422d7695976ba785689083e8ae2ae9f3126989ed4a831f532ad313c7962d6be76d14f3b203d0df1caf251a214a4b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonrpclib-pelix \
python310-jsonrpclib-pelix \
python3dist-jsonrpclib-pelix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
