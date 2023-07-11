SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python39-humanhash3-0.0.6-2.18.noarch.rpm"
RPM_HASH = "a58ab591c72d1c87548ff57c69d3d0385b4461e6deed2d75a9aaefb864297800f59027da2023d21f01810eaa5f6a94f000c8b75ca06e27dd86c238733966cb87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-humanhash3 \
python39-humanhash3 \
python3dist-humanhash3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
