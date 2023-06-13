SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.17.1"

RPM_NAME = "python39-terminado-0.17.1-1.3.noarch.rpm"
RPM_HASH = "e35773b956c770fda419a97b72b58bf14f91f541c6bcdb349afae1435f2a6f1af4c609ef237cd3d4ad27cf269634a0530e7eb2bd44e88c5bc75332664400f781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(terminado) \
python39-terminado \
python3dist(terminado)"

RDEPENDS:${PN} += "python(abi) \
python39-ptyprocess \
python39-tornado"

inherit rpm
