SUMMARY = "The regina shared library"
DESCRIPTION = "This package provides the shared library for Mark Hessling's implementation \
of the REXX Interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "libregina3-3.9.1-6.9.aarch64.rpm"
RPM_HASH = "9e65aa4608dee7cf0541083e13d21be65e88afdb03c49ae4d4199bc288699ac521dae9aa5ab5ca6e9e0d8f2494597aa770c733b71b3a56c8e1c270f1a4823ae5"

RPROVIDES:${PN} += "libregina.so.3 \
libregina3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
