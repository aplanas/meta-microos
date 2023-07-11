SUMMARY = "Shared libraries for Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains the shared libraries needed by programs built \
with newt. \
 \
Newt is a programming library for color text-mode widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "libnewt0_52-0.52.23-2.2.aarch64.rpm"
RPM_HASH = "d720dfd3845df3b3250002c088e37a2c170883b50acb230fe5a08d00fbbbf8532198fbcc556499fd2455c62bd1242a39b14ec952f1e8b03febba3e5c006fe15b"

RPROVIDES:${PN} += "libnewt.so.0.52 \
libnewt0-52"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2"

inherit rpm
