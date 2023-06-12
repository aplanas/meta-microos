SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.41"

RPM_NAME = "python311-serpent-1.41-2.3.noarch.rpm"
RPM_HASH = "bb711e20c303617c089254004b517c33da459aef9c063c0428ea43ab4e33213464db398f41181473da4fed20012bc67827c0e074f773b334488e28e3aad5f8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(serpent) \
python311-serpent \
python3dist(serpent)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
