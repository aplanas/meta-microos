SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.17.1"

RPM_NAME = "python310-terminado-0.17.1-1.3.noarch.rpm"
RPM_HASH = "662c22dabd95930bed00c922fbc29b46000fea01c362c2dd1ebb170673375408cb0180859c4287bc467ce2e37d2087659713badc0c95fca2040aff12873ef306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminado \
python3.10dist-terminado \
python310-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python310-ptyprocess \
python310-tornado"

inherit rpm
