SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.41"

RPM_NAME = "python39-serpent-1.41-2.3.noarch.rpm"
RPM_HASH = "18869da404e146b4761210bfc6b71d35276d1b3ba20f3283e675323517e2007d57e5a27421a7f65091fef7f094f972fb85b966db2c6d9bafb8d9127dedc262cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-serpent \
python39-serpent \
python3dist-serpent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
