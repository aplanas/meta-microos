SUMMARY = "Motif Resource Manager library"
DESCRIPTION = "The Motif resource manager (MRM) is responsible for creating widgets \
based on definitions contained in user interface definition (UID) \
files created by the UIL compiler. MRM interprets the output of the \
UIL compiler and generates the appropriate argument lists for widget \
creation functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libMrm4-2.3.8-2.5.aarch64.rpm"
RPM_HASH = "1b06b128be4a0fbd2a0a7a24566624942e3c7e055ce59f2622de13d9a62190fae864d4606422e2a5fee56b0bc4f574e2bb88a4c560317c3cecdc325d8b28e0f2"

RPROVIDES:${PN} += "libMrm.so.4 \
libMrm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
