SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python310-pyenchant-3.2.2-1.10.noarch.rpm"
RPM_HASH = "4627fe4177e63ae0186648b9ae41f1cbdc4bdf9e6c7d752085e48ad6d4dffb8a2594a296cb953d8042a75584ef69ae7af838b283a2a6ad34e2042a7cb16eb65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyenchant \
python310-enchant \
python310-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
