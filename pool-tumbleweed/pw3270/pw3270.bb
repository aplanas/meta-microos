SUMMARY = "IBM 3270 Terminal emulator for GTK"
DESCRIPTION = "GTK-based IBM 3270 terminal emulator with many advanced features. It can be used to communicate with any IBM host that supports 3270-style connections over TELNET. \
 \
Based on the original x3270 code, pw3270 was originally created for Banco do Brasil, and is now used worldwide."
LICENSE = "GPL-2.0-only"

PV = "5.4"

RPM_NAME = "pw3270-5.4-2.2.aarch64.rpm"
RPM_HASH = "5e984ca0b41614412872d06eadc31cb083396772a86c1b43fa62b1d49f2098cde2f9c207f14f76af31b15255b42c84358aa1f6ae250ffeb57d8b907e22734e64"

RPROVIDES:${PN} += "pw3270"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
lib3270.so.5.4 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libv3270.so.5.4 \
pw3270-branding \
shared-mime-info"

inherit rpm
