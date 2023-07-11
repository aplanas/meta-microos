SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python310-rpcq-3.10.0-1.6.noarch.rpm"
RPM_HASH = "26e7026068d46a45ce429f028f126f18b200f74b01b7ad1f63b8ead7d2d7fe8faf0a8eebf46f51af6a8d646df84e930380af088bc454add2658b89e7e33e8438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rpcq \
python310-rpcq \
python3dist-rpcq"

RDEPENDS:${PN} += "python-abi \
python310-msgpack \
python310-python-rapidjson \
python310-pyzmq \
python310-ruamel.yaml"

inherit rpm
