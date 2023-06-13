SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "0.4.3.2"

RPM_NAME = "python310-jsonrpclib-pelix-0.4.3.2-1.3.noarch.rpm"
RPM_HASH = "edeaecd8117f86210bde7df22e4892dfb9aec5be629362aa8400f6f1a0d8dd4f1cf16f49379a68810756ee93eea50d81b9d10474fa8a28321a59470e0f9530d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonrpclib-pelix \
python3.10dist(jsonrpclib-pelix) \
python310-jsonrpclib-pelix \
python3dist(jsonrpclib-pelix)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
