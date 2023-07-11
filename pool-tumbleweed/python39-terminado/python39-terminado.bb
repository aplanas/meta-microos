SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.17.1"

RPM_NAME = "python39-terminado-0.17.1-1.5.noarch.rpm"
RPM_HASH = "d2ca8d6b68e4022e5877fc15bdd5a2e3c2a15d142afc475187293b1b20045cff2b2b55dc9f39438a91918b467b0f4b2b6efb103fa3953563c132cc2ec6bfe55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-terminado \
python39-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python39-ptyprocess \
python39-tornado"

inherit rpm
