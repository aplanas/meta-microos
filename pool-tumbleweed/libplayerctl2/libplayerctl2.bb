SUMMARY = "A library for controlling media players over D-Bus"
DESCRIPTION = "A library for controlling media players that implement the MPRIS D-Bus \
Interface Specification."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "libplayerctl2-2.4.1-1.9.aarch64.rpm"
RPM_HASH = "6d96437ed9f06d4b78978a47e5c68a114968977bba4679408911a052ca1e8b155f9b7533c07153409554ea71a09e897b82771460468f9bcaa1e05b68579d89a5"

RPROVIDES:${PN} += "libplayerctl.so.2 \
libplayerctl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
