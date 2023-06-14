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

RPM_NAME = "ruby-yui-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "92e66b623be48c536cc5692fa76edf2839a026a2f770a2c8f1332fd42fafdb31d5ab61242547047912136d3f621452bfd41a840cdf5b2283d9b802415995847b"

RPROVIDES:${PN} += "ruby-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libyui.so.16"

inherit rpm
