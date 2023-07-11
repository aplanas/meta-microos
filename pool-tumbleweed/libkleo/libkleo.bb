SUMMARY = "Base package of Kleopatra, a key manager by KDE"
DESCRIPTION = "libkleo is a library used by KDE PIM applications to handle cryptographic key \
and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkleo-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1ceb872ed6c895dad655b45a43c6333ea9818531548807d5984f171e767d079632872904c18f1c3f6973662cfc5c2fa361eabf1038b4dcb81b912a46be398f21"

RPROVIDES:${PN} += "config-libkleo \
libkleo"

RDEPENDS:${PN} += ""

inherit rpm
