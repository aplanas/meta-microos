SUMMARY = "Plugins for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwenhywfar79-plugins-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "18d5b656821ae0cbbf545783179bb8e6304944c6a9643692fe4c5c17c46b9cfed62cf14753ed1fb80c8e482bc41403de64a02b8c8c403894cedbf94a9057ff9c"

RPROVIDES:${PN} += "libgwenhywfar79-plugins"

RDEPENDS:${PN} += "gwenhywfar \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
