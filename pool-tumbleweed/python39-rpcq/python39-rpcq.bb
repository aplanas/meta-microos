SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python39-rpcq-3.10.0-1.4.noarch.rpm"
RPM_HASH = "13fa658f9ca14d23a31bfc04001a71174f6fda25c0334c0e489884d5ee8cb82a33733426903426c4c05bd17c9b7263c3e1c83e96af016d9a20f06f2159803f37"
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
