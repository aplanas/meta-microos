SUMMARY = "Key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "libdconf1-0.40.0-3.4.aarch64.rpm"
RPM_HASH = "020cdf5508b0679e2a8414aa993847ac9c4437e2f53121663d1e75e14327227007439e09f76e0cd11e4c3ebbc6a99a2f529ab84d0123ab344aad4c69e0a206da"

RPROVIDES:${PN} += "libdconf.so.1 \
libdconf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
dconf \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
