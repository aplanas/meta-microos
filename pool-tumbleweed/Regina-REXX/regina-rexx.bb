SUMMARY = "Mark Hessling's implementation of the REXX Interpreter"
DESCRIPTION = "Mark Hessling's implementation of the REXX language interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-3.9.1-6.10.aarch64.rpm"
RPM_HASH = "97ebc7db466548f633d3761bd544049c0ef02038520ba8a7b67656fb3719281696707adc9d584a0f1813fca4816f2f6b76a545ca231140192f42c96a33e75a72"

RPROVIDES:${PN} += "Regina-REXX \
rexx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libregina.so.3 \
update-alternatives"

inherit rpm
