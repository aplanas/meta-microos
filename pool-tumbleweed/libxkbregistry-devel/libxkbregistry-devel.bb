SUMMARY = "Header files for xkbregistry"
DESCRIPTION = "libxkbregistry is a C library that lists available XKB models, \
layouts and variants for a given ruleset. \
 \
This is aimed at tools that provide a listing of available keyboard \
layouts to the user."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbregistry-devel-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "957fe9c0b3c5c2374991f4ac765bb940762e70fdb1620e2a7c12c4bd9fe29b80712ecda59647ee685434b795ee7592d5b0971b2c68fd36faca345f2109efa6de"

RPROVIDES:${PN} += "libxkbregistry-devel \
pkgconfig-xkbregistry"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbregistry0 \
pkgconfig-libxml-2.0"

inherit rpm
