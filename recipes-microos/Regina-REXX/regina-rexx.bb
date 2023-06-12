SUMMARY = "Mark Hessling's implementation of the REXX Interpreter"
DESCRIPTION = "Mark Hessling's implementation of the REXX language interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-3.9.1-6.9.aarch64.rpm"
RPM_HASH = "88387a606374fae3d98482fa93e7001f63a3db298fb99c9fca8e8d69d5289cff7212d2d78fbf8b97339b6b3c64d5cc11f80090a21e022c0d0be0060ff99d2830"

RPROVIDES:${PN} += "Regina-REXX \
Regina-REXX(aarch-64) \
rexx"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libregina.so.3()(64bit) \
libregina.so.3(regina_2.0)(64bit) \
update-alternatives"

inherit rpm
