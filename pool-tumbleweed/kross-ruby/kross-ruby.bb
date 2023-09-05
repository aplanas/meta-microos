SUMMARY = "Ruby Bindings for kross"
DESCRIPTION = "The Ruby bindings which can be used with KROSS"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kross-ruby-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5dc2825dcc3839c3f07bbc482336125e25d8ba67fec4a767765848f0a672b55f1cd5d80a9975a750cb44f845307fefdcac8e76dd71b9cf6f4dc71e119910b75b"

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
