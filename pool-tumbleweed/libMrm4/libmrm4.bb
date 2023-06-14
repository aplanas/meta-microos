SUMMARY = "Motif Resource Manager library"
DESCRIPTION = "The Motif resource manager (MRM) is responsible for creating widgets \
based on definitions contained in user interface definition (UID) \
files created by the UIL compiler. MRM interprets the output of the \
UIL compiler and generates the appropriate argument lists for widget \
creation functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libMrm4-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "807cfeacd36bcec6a0494ea20225bcb0489e10a69a48bc8eb8f2b11a64be6f31800d82c1ef21ac1bea9702c2606c7af1401dfc3c19a05ad8e8d154947c0a700a"

RPROVIDES:${PN} += "libMrm.so.4 \
libMrm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
