SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.41"

RPM_NAME = "python310-serpent-1.41-2.3.noarch.rpm"
RPM_HASH = "86d73345e86fd435263cf863d7a4f926ca0c1c28dc2f211a983630a27f9da19b9d0b97d6894e70c22d46bc5b33302e970fbaa5c6c8ec42b0e42cd93a10a096b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-serpent \
python3.10dist(serpent) \
python310-serpent \
python3dist(serpent)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
