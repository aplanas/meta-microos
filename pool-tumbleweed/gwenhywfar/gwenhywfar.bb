SUMMARY = "Multiplatform helper library for other libraries"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes some \
often needed functions (for example, handling and parsing of \
configuration files, reading and writingof XML files, and interprocess \
communication)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "e8ce5773c3b6dd19f7e1072bdb830f29a076dbd0efc33b6225fe42b35193be37dde0149e0bef85cbfa84d0dec04f1e03029f1460959ca151f8205f6ddafb6f8e"

RPROVIDES:${PN} += "gwenhywfar \
gwenhywfar(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
