SUMMARY = "Tests for the glib2 package"
DESCRIPTION = "The glib2-tests-devel package contains tests that can be used to verify \
the functionality of the installed glib2 package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "glib2-tests-devel-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "148b2696df738996c83bfd3273bdaf5f3351a8b677a17d6ec370bb835dedffe12c2b5645da7dd1c4055022c9eaa1ba68bf7177cf6c8cc36169aa2ab83b3bf11a"

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
