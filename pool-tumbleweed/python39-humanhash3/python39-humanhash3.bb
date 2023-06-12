SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python39-humanhash3-0.0.6-2.17.noarch.rpm"
RPM_HASH = "acc658e3f637ff573098f334c6f5e74f8602b46daf88dbbb29952e3279b8cbc45377f6d2626b3a798cac555b2b2bfd43e052233152cbab6e462a8f183edd381f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(humanhash3) \
python39-humanhash3 \
python3dist(humanhash3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
