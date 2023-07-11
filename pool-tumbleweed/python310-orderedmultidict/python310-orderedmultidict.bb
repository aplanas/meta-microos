SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.1"

RPM_NAME = "python310-orderedmultidict-1.0.1-3.2.noarch.rpm"
RPM_HASH = "4e41bbfac2dc6494a14cc90ea4a288173b5bbea7a9def72d1c9cb035f54b83960c069c8f696233341ba3027050438b1db87d662a0394e0eb3d52e34617a87d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-orderedmultidict \
python310-orderedmultidict \
python3dist-orderedmultidict"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
