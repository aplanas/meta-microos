SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python39-pyenchant-3.2.2-1.10.noarch.rpm"
RPM_HASH = "4152d47c94bb2d3cd684817d10beb40dfe7fe7e1e026c2bc261e0c1c26189bb723ff0e2801c2938193a8ef1a3d479583443f372105f21868cbc11d8e73958101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyenchant \
python39-enchant \
python39-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
