SUMMARY = "Extensions for the Telepathy Framework Centralized Logging"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libtpl-extensions3-0.8.2-7.10.aarch64.rpm"
RPM_HASH = "0bfa14d9ae42506f45fdfa4ab292e76bb110c435550b394292ba990ac0e55f08eee89a0ce60cd7cad740d666f5e3dae36381275e0318c10c2a8e1e594b26cf03"

RPROVIDES:${PN} += "libtpl-extensions.so.3 \
libtpl-extensions3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
