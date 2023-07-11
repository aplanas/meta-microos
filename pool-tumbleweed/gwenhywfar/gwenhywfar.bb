SUMMARY = "Multiplatform helper library for other libraries"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes some \
often needed functions (for example, handling and parsing of \
configuration files, reading and writingof XML files, and interprocess \
communication)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "deec7e05d0e1b339fd16421314c61566c37cbabe10ebeb2b28adfd782910e4266315d76d1c6ee16e3dff287f795acd3edfbedca62ed289c2ce2191a08a0deace"

RPROVIDES:${PN} += "gwenhywfar"

RDEPENDS:${PN} += ""

inherit rpm
