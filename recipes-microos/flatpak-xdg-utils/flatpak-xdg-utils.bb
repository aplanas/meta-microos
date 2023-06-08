SUMMARY = "Command-line tools for use inside Flatpak sandboxes"
DESCRIPTION = "This package contains a number of command-line utilities for use inside \
Flatpak sandboxes. They work by talking to portals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "flatpak-xdg-utils-1.0.5-2.4.aarch64.rpm"
RPM_HASH = "5e5e1c2f71f6187d8079a462f7de43c82b851f18bc77e152555030d2ae8d22eeffef381472aee0fed5acf2dd3c144d744522f62c8d8664c544cd1add12809882"

RPROVIDES:${PN} += "flatpak-xdg-utils flatpak-xdg-utils(aarch-64)"
RDEPENDS:${PN} += "flatpak-spawn ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
