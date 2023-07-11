SUMMARY = "Console screen"
DESCRIPTION = "This package allows to run multiple consoles in one 'screen' and \
to start the screen automatically during boot."
LICENSE = "BSD-4-Clause"

PV = "1.4"

RPM_NAME = "cscreen-1.4-1.6.noarch.rpm"
RPM_HASH = "51bcade709e5e56727957ecfc7932663ee2543732f0703b316a4aaff4b55248485f543ae8dca11f8c56c4a12c7a166ebd33d89f4fb907512ee8a84ff75af2447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-cscreen \
cscreen"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
screen \
shadow \
sudo"

inherit rpm
