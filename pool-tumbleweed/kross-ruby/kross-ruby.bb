SUMMARY = "Ruby Bindings for kross"
DESCRIPTION = "The Ruby bindings which can be used with KROSS"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kross-ruby-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5fedf35fb34351642a63ff061bb4ddebcecc479bc4bf2deb749cfa99828444993fdb27e6d9e8eab9c2512b1bdf9bb38cc498ce72a3b94f24fb2b94bd84b84c92"

RPROVIDES:${PN} += "kross-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5KrossCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libruby3.2.so.3.2 \
libstdc++.so.6"

inherit rpm
