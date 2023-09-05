SUMMARY = "Base package of Kleopatra, a key manager by KDE"
DESCRIPTION = "libkleo is a library used by KDE PIM applications to handle cryptographic key \
and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkleo-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "41cc690fd9359e5615a5c3b24ccf4b82b527477aa25c645a4450334a4412cffee9a214188f03ff27f809da37f527d4bb080b60fe2bd537d5d496ac6a90e1b1c0"

RPROVIDES:${PN} += "config-libkleo \
libkleo"

RDEPENDS:${PN} += ""

inherit rpm
