SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.41"

RPM_NAME = "python39-serpent-1.41-3.3.noarch.rpm"
RPM_HASH = "4aa6d43ee4712ac5e946fe469fb4468a6843ef32a1dc3b10806e037cf11df02d3cdc59d45cc7c0aeeffb16a1a304e4cf060ffe221d452de24f402c3c4656611b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-serpent \
python39-serpent \
python3dist-serpent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
