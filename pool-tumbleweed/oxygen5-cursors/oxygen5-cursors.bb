SUMMARY = "The KDE Plasma Workspace Cursors"
DESCRIPTION = "This package contains the Oxygen cursor set."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "oxygen5-cursors-5.27.6-1.1.noarch.rpm"
RPM_HASH = "c0dc275b04eddce90249260df12b91e65c5d797ec14bb2bc60917b033d9c221128e87483633b82def6ed463d74eb4accf4a640e186160499d5a2fafc129bf933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-cursors \
oxygen-cursors4 \
oxygen-cursors5 \
oxygen4-cursors \
oxygen5-cursors"

RDEPENDS:${PN} += ""

inherit rpm
