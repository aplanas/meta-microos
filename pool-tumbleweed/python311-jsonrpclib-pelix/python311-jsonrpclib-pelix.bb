SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "0.4.3.2"

RPM_NAME = "python311-jsonrpclib-pelix-0.4.3.2-1.4.noarch.rpm"
RPM_HASH = "35bddd0602f7d455d1dda6ec8867473eaa9b264069a39872cf1ee2d1dd34b478142b7938d6049f1f807119aa392e77be97d5e783ab0ce4ae7a0cc4e4dcf55575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonrpclib-pelix \
python3.11dist-jsonrpclib-pelix \
python311-jsonrpclib-pelix \
python3dist-jsonrpclib-pelix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
