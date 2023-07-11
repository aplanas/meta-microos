SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python39-rpcq-3.10.0-1.6.noarch.rpm"
RPM_HASH = "fcc56b2d0a827a70df8822d0ab0f17eabb6279cf7d05af7627e6281471e6aab10fca15045eb9d1ca5b2f4bc135244544408c2cc3ee5b92aaa47dbdd3bb644e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpcq \
python39-rpcq \
python3dist-rpcq"

RDEPENDS:${PN} += "python-abi \
python39-msgpack \
python39-python-rapidjson \
python39-pyzmq \
python39-ruamel.yaml"

inherit rpm
