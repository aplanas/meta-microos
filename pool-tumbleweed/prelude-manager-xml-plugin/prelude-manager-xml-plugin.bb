SUMMARY = "XML report plugin for Prelude Manager"
DESCRIPTION = "This plugin adds XML logging capabilities to prelude-manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-xml-plugin-5.2.0-2.11.aarch64.rpm"
RPM_HASH = "0d2a984f8476381136127be60dbd4db22db7495f4d726cdd179153c0aed1966c6d46a1c76671b09f5822e4ba195d35656ec3766032bdf1deba316c1a46475763"

RPROVIDES:${PN} += "prelude-manager-xml-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
prelude-manager"

inherit rpm
