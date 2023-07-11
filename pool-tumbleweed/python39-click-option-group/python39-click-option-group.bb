SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python39-click-option-group-0.5.6-1.1.noarch.rpm"
RPM_HASH = "99c4272f73676710e1e3fe395e9bdb40da59dcf7ebffb1ad5887485329b5a8e836c3d088bc52110f578bcc57d4081b92424548effe36fd30b887f854689b8659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-option-group \
python39-click-option-group \
python3dist-click-option-group"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
