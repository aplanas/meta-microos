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

RPM_NAME = "ruby-yui-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "6a548e2459a05f4d6b0d1fe415f2026cded924761863b2b38c1c9ea2897db8beb610a1cd8ef15389981b90f2279e16a90b7c9c6b572f0b444ca3b7a84d8998b7"

RPROVIDES:${PN} += "ruby-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libyui.so.16"

inherit rpm
