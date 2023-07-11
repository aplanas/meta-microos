SUMMARY = "Sounds for gnubg"
DESCRIPTION = "Sounds for GNU Backgammon. See description of gnubg for more details."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-sounds-1.06.002-3.5.noarch.rpm"
RPM_HASH = "2347a1bacc51e7db4b3bb795e1ba9fb6d889aa1b23fc3e6d44424102ba03c2eb5d71959802ceded43019be10f0c502b1ebfae58d9a06677f365767658121a4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-sounds"

RDEPENDS:${PN} += "gnubg"

inherit rpm
