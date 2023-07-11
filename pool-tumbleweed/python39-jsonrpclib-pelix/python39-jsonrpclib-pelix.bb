SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "0.4.3.2"

RPM_NAME = "python39-jsonrpclib-pelix-0.4.3.2-1.4.noarch.rpm"
RPM_HASH = "3847aaedb1642f720f9fe8ac98c668797e1bc7ab53456b8a56686772c45414393f9b7e9ab2ef9a83dc4a4a0bcd47c56736d652a4d4cae872bc59e3c5828c2ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonrpclib-pelix \
python39-jsonrpclib-pelix \
python3dist-jsonrpclib-pelix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
