SUMMARY = "Ruby bindings for libyui"
DESCRIPTION = "This package provides Ruby language bindings to access functions of \
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

RPM_NAME = "ruby-yui-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "b11f1648c46e93313333cab10864fba82e270e1514998e7f803e8defaef3ea8e39b23097f417e4363d134f8470379983bd0e32b54eb80bf2dbd0283d3b332c05"

RPROVIDES:${PN} += "ruby-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libyui.so.16"

inherit rpm
