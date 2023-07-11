SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.41"

RPM_NAME = "python311-serpent-1.41-3.3.noarch.rpm"
RPM_HASH = "7e3412ae9da079091ee0b1937f3fc8d47f2677ddc7d6d7cbc8ffacc229faa3b8480d2f111301c30d347ea970658b96c768e618622613821b7b0e328317d60b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-serpent \
python3.11dist-serpent \
python311-serpent \
python3dist-serpent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
