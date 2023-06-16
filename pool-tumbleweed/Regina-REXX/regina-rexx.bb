SUMMARY = "Mark Hessling's implementation of the REXX Interpreter"
DESCRIPTION = "Mark Hessling's implementation of the REXX language interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-3.9.1-6.9.aarch64.rpm"
RPM_HASH = "88387a606374fae3d98482fa93e7001f63a3db298fb99c9fca8e8d69d5289cff7212d2d78fbf8b97339b6b3c64d5cc11f80090a21e022c0d0be0060ff99d2830"

RPROVIDES:${PN} += "Regina-REXX \
rexx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libregina.so.3 \
update-alternatives"

inherit rpm
