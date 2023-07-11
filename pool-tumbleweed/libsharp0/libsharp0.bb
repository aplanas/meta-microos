SUMMARY = "Shared library for libsharp -- a spherical harmonic transforms library"
DESCRIPTION = "libsharp is a code library for spherical harmonic transforms (SHTs). \
 \
This package provides the shared library for libsharp."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libsharp0-1.0.0-1.12.aarch64.rpm"
RPM_HASH = "5ea4eb06744081ffb8ffab4b88b6b72ea5949bc06032e62d340d43de81efc2b0c65f148722bf2b6eff1c2efa4ad721f7c1589360315bfc92a2d1c4fb4e447e34"

RPROVIDES:${PN} += "libsharp.so.0 \
libsharp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
