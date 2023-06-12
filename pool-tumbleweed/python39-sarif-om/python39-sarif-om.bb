SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-sarif-om-1.0.4-1.4.noarch.rpm"
RPM_HASH = "29efc51b1bd3306d64318da2d1e7c1df354dc108be15fe3c3f4beaf1bb28949598a06be589a783151ebc5c2f6d375a6dc416beffdae316878636fc568784f290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sarif-om) \
python39-sarif-om \
python3dist(sarif-om)"
RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-pbr"

inherit rpm
