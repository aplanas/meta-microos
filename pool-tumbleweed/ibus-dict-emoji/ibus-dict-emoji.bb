SUMMARY = "Emoji dictionary for IBus"
DESCRIPTION = "This package contains data of emoji dictionary for IBus and other applications"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-dict-emoji-1.5.28-2.2.noarch.rpm"
RPM_HASH = "ac911f9adeacb3c81c5f590ac433d5a06c066b7c358651b49199a4ed7ae0cc746dbafaf6d56dd89124620abe6d8ff5b78efe4c512d91e3d046c5d8c2704af577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-dict-emoji"

RDEPENDS:${PN} += ""

inherit rpm
