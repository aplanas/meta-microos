SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.41"

RPM_NAME = "python310-serpent-1.41-3.3.noarch.rpm"
RPM_HASH = "f8fd24d3a661a6013a69b0a6d359b69f67c41331d47df6267c53702bdc0d00c6a9fef02fe98a3941684e82e4db70581fc5e08e76212488f362814621264fa987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-serpent \
python310-serpent \
python3dist-serpent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
