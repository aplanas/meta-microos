SUMMARY = "XML report plugin for Prelude Manager"
DESCRIPTION = "This plugin adds XML logging capabilities to prelude-manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-xml-plugin-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "c7a8ffeb4c0f70caeac390542f2e2da7f19da8a7a08c13ddb6db20aa2d625a542d822d9b7eb7b6b01f3c012c9e485aa4e27ec43aa4104f1b57bc3fb63fd748bd"

RPROVIDES:${PN} += "prelude-manager-xml-plugin \
prelude-manager-xml-plugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
prelude-manager"

inherit rpm
