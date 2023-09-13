SUMMARY = "Tests for the glib2 package"
DESCRIPTION = "The glib2-tests-devel package contains tests that can be used to verify \
the functionality of the installed glib2 package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "glib2-tests-devel-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "8f1869c0d0bf6bc4eebcff767025518c0a4146ad2abb1cc6cc019de5040d862d9eaf1f18e77d26b041c667ff74a8676ffa123148c2aedaf337e72b0010798cd8"

RPROVIDES:${PN} += "glib2-tests \
glib2-tests-devel \
libgdbus-example-objectmanager.so \
libmoduletestplugin-a-library.so \
libmoduletestplugin-a-plugin.so \
libmoduletestplugin-b-library.so \
libmoduletestplugin-b-plugin.so \
libresourceplugin.so \
libtestmodulea.so \
libtestmoduleb.so"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
glib2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
