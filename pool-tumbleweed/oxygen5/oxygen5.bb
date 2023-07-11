SUMMARY = "Oxygen style, KWin decoration and cursors"
DESCRIPTION = "Provides Oxygen style, KWin decoration, and cursors."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "oxygen5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "2d322ce0e6289008aa541ec6c7c9689ef66794a7df3f06f6f5a5ccea6f913c1d8bcddde25d5e2c1cdb9df54f1bb2c5cceb3cad562f99429d58ab8a302d980dd2"

RPROVIDES:${PN} += "oxygen5"

RDEPENDS:${PN} += "oxygen5-decoration \
oxygen5-style"

inherit rpm
