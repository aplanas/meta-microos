SUMMARY = "Glib bindings for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "libmm-glib0-1.20.6-1.2.aarch64.rpm"
RPM_HASH = "eff390a2a34e1dd5b71de58dd6ab8018b46cc6aa961caf8b0f068feb1a59e753ac20ec8de59ac485d1e84fbb79741f241f64e7972f448a443d7de056d8eb3d42"

RPROVIDES:${PN} += "libmm-glib.so.0 \
libmm-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
