SUMMARY = "Wayland Clipboard Utilities"
DESCRIPTION = "This project implements two command-line Wayland clipboard utilities, wl-copy and wl-paste, that let you easily copy data between the clipboard and Unix pipes, sockets, files and so on."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-2.1.0-1.7.aarch64.rpm"
RPM_HASH = "c7bc3b7c4dff2d7feed407892685c3197b8319dff95a9477644515522941cf9410632c75ba541e9cea3007b0b6c7e2464bcab4f02e71861eba497ac22c730a09"

RPROVIDES:${PN} += "wl-clipboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
