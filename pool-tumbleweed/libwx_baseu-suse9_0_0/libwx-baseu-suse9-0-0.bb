SUMMARY = "wxWidgets base library"
DESCRIPTION = "Every wxWidgets application must link against this library. It \
contains mandatory classes that any wxWidgets code depends on (e.g. \
wxString) and portability classes that abstract differences between \
platforms. wxBase can be used to develop console-only applications."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "48749956cca3331fc14610c9c452a1f9db421650fb0d9fb2601a4a6c25127875be6a8bd973378c33479aaba1963687c749e3c3f144540dee56f4b41611de6bd0"

RPROVIDES:${PN} += "libwx-baseu-suse.so.9.0.0 \
libwx-baseu-suse9-0-0 \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-32.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
