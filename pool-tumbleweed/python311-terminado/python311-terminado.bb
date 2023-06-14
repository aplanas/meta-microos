SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.17.1"

RPM_NAME = "python311-terminado-0.17.1-1.3.noarch.rpm"
RPM_HASH = "d51948543d1e92cf03192a7d1479f637ada00dfcdd9efce07b04352bf2c59e73aae6466a9c5e4dd7aa8cc6e8ab987835a137a07d08a28220fe3329aed3922a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-terminado \
python311-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python311-ptyprocess \
python311-tornado"

inherit rpm
