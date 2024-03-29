SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.109.0"

RPM_NAME = "syntax-highlighting-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "919b647e31c1d957d8438c5eaf8c11362d493bf1b71b9315db9e195cf5a4a62efb56e891248d791f649c54429c9341b5883b23b9fce1625efddd1eeb3861a9b3"

RPROVIDES:${PN} += "syntax-highlighting"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
