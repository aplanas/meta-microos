SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python39-ijson-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "e07ca5d5abadc48309a12cc7b7c62bfe362c7cc1c9376afed09619788ede3ad9347038db12186dd76559d89d9e97d376ce1de886879a89dfd1911eedf29ce4f3"

RPROVIDES:${PN} += "python3.9dist-ijson \
python39-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
