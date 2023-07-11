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

RPM_NAME = "python3-yui-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "8f97ad0f7b16622d7d81f8c256980e614dec8bcef9066ea23f7ed6d4875b0975fc77b29a08a94f67c0140520e7880a09266628d043b613eb2a028635a4f5b5a4"

RPROVIDES:${PN} += "python3-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libyui.so.16 \
python-abi"

inherit rpm
