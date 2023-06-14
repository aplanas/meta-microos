SUMMARY = "Glib bindings for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "libmm-glib0-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "8c11de9cd12e17703be951877e640db26e8a300dd12b49adca7e8629942246b889f1ca6680c7749e9a51bef9a14e43ace745d7de2469c1e6dff8c2c441096197"

RPROVIDES:${PN} += "libmm-glib.so.0 \
libmm-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
