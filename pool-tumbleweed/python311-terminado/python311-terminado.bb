SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.17.1"

RPM_NAME = "python311-terminado-0.17.1-1.5.noarch.rpm"
RPM_HASH = "ba73b05c1b810d156a6cb4740dd578042fc76a9799e75ccfbbeb9b29317820b99a268974bbd422ee154cc79ac5ebab9afdc93c93ecc3df24d409af9b098c8fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminado \
python3.11dist-terminado \
python311-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python311-ptyprocess \
python311-tornado"

inherit rpm
