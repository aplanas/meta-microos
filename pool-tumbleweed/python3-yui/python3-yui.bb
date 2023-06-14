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

RPM_NAME = "python3-yui-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "43381c35f2a698e4f7dccab6bb7da149cff85e023fd330e3e34199f987f813c98d924d41514878f53beff69097fd052e88f1ac5f15531cdebe26d4e8350dce5d"

RPROVIDES:${PN} += "python3-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libyui.so.16 \
python-abi"

inherit rpm
