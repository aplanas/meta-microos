SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "libwsutil14-4.0.6-3.1.aarch64.rpm"
RPM_HASH = "115a5f147bad5f9888d7ec03aa3f9d6a8873b0702421e82f7f3e6687208181bad05e1d3f284b74bd15cafbf6d504cbd6193564f1dff49757bcca34ae07c89bb0"

RPROVIDES:${PN} += "libwsutil.so.14 \
libwsutil14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libpcre2-8.so.0"

inherit rpm
