SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.17.1"

RPM_NAME = "python310-terminado-0.17.1-1.5.noarch.rpm"
RPM_HASH = "1663382eb72dc407db2985d3eac01d91b961c3d23c62f665f40bd0cca0b763c7f0ec61fdac22bbaa7145e62fc95ca81df969a5554a26e88e800a416d034f2944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-terminado \
python310-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python310-ptyprocess \
python310-tornado"

inherit rpm
