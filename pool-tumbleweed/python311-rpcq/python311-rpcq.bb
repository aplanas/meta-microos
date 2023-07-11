SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python311-rpcq-3.10.0-1.6.noarch.rpm"
RPM_HASH = "45df89f5a265c2746457748407a5d3d0f6c54c477ce3a3702e6c4d1232a99d9504a3262f535bc44349ddd56b7fe81393fe9a59a0c2881e8952ef9be4a8d765ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpcq \
python3.11dist-rpcq \
python311-rpcq \
python3dist-rpcq"

RDEPENDS:${PN} += "python-abi \
python311-msgpack \
python311-python-rapidjson \
python311-pyzmq \
python311-ruamel.yaml"

inherit rpm
