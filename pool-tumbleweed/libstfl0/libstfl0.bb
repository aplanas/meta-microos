SUMMARY = "Structured Terminal Forms Library"
DESCRIPTION = "STFL is a library which implements a curses-based widget set for text \
terminals. The STFL API can be used from C, SPL, Python, Perl and Ruby. \
 \
A special language (the Structured Terminal Forms Language) is used to \
describe STFL GUIs."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "libstfl0-0.24-3.15.aarch64.rpm"
RPM_HASH = "6bc3a86e72386ae785f6306191b730ad565ce7b484f046360f6595a584160df0bc3df5866e03d095306220119f60a8b5ccde0bbe4d59f0d8b55529bf27d4d64b"

RPROVIDES:${PN} += "libstfl.so.0 \
libstfl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
