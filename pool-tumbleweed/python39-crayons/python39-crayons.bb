SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-crayons-0.4.0-3.8.noarch.rpm"
RPM_HASH = "6d82136a8a12eabe5bc10eac3fe49774ea0e45a8f25847f954cb1b15d94d839d6e31d1b89d2376309fc85b98085fe6b6202421d25fd008f2ab580640802383e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crayons \
python39-crayons \
python3dist-crayons"

RDEPENDS:${PN} += "python-abi \
python39-colorama"

inherit rpm
