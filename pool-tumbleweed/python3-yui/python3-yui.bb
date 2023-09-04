SUMMARY = "Python 3 bindings for libyui"
DESCRIPTION = "This package provides Python 3 language bindings to access functions of \
libyui - An User Interface engine that provides the \
abstraction from graphical user interfaces (Qt, Gtk) and text based \
user interfaces (ncurses). \
 \
Authors: \
--------- \
-    kkaempf@suse.de \
-    dmacvicar@suse.de"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "python3-yui-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "d13ff99eb1f39064bcc2dc6cac19c280dea410b01f4a363ad5cf051b12879f0d37cc4de11e8686addd45cccff0ee54a9f140d5428aa2f36244e3731c41cde790"

RPROVIDES:${PN} += "python3-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libyui.so.16 \
python-abi"

inherit rpm
