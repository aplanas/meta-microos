SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python311-pyenchant-3.2.2-1.8.noarch.rpm"
RPM_HASH = "00e56af159e98a0a52e32857add2dda7a2cd9c389c5753a88979564c2ca1c23b7ef4822352b8a664f3d915df3044cd9a07032b760d7e7677034772720d97f73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyenchant) \
python311-enchant \
python311-pyenchant \
python3dist(pyenchant)"
RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python(abi)"

inherit rpm
