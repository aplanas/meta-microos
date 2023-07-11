SUMMARY = "The regina shared library"
DESCRIPTION = "This package provides the shared library for Mark Hessling's implementation \
of the REXX Interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "libregina3-3.9.1-6.10.aarch64.rpm"
RPM_HASH = "dad1cde4553c5a1a06aa9a5bc7dfe04777990a8ce949d75a47f365a974239d47c952013cf66fd99768c71eb74934a8dc9e9f8152baf9ca315caed18af83e8298"

RPROVIDES:${PN} += "libregina.so.3 \
libregina3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
