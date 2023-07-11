SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.1"

RPM_NAME = "python39-orderedmultidict-1.0.1-3.2.noarch.rpm"
RPM_HASH = "da505000cd8228bafd02daa7de7bc9f15326dcce737c5128554a278ad7623b38887edff3958bb7c60a2a720c88c583fa51b6377852733c9feeb6b46916d3251c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-orderedmultidict \
python39-orderedmultidict \
python3dist-orderedmultidict"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
