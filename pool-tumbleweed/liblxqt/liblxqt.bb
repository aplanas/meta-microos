SUMMARY = "Core utility library for LXQt"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "134b84a82969c01eae352c4e3c1c4a29acfffca925fe507d17462a8374615ad147f8e12c94bcc2c9f85ae7c9b9e66aaefc6fb978207208fefc94ec60ee0c4043"

RPROVIDES:${PN} += "liblxqt \
liblxqt-qt5"

RDEPENDS:${PN} += "/usr/bin/pkexec \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
