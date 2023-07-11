SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-tinyrecord-0.2.0-2.9.noarch.rpm"
RPM_HASH = "a61a6ea588b51ddf6759d5674da30b738f556cead01d0b4fc173be871a2778c4eab56558840eba1a95ebb07df1fcb034eda210cdca2581af7eff472a8dee13bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tinyrecord \
python310-tinyrecord \
python3dist-tinyrecord"

RDEPENDS:${PN} += "python-abi \
python310-tinydb"

inherit rpm
