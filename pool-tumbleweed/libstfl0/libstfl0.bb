SUMMARY = "Structured Terminal Forms Library"
DESCRIPTION = "STFL is a library which implements a curses-based widget set for text \
terminals. The STFL API can be used from C, SPL, Python, Perl and Ruby. \
 \
A special language (the Structured Terminal Forms Language) is used to \
describe STFL GUIs."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "libstfl0-0.24-3.16.aarch64.rpm"
RPM_HASH = "4cd150de7a62c7d059ade97d1f17e476a1bdff484208855d27a03fa64398bd2c1e1a98c6a0369524b7a785511eaece87d07baf465da75474bfc9416d226e1309"

RPROVIDES:${PN} += "libstfl.so.0 \
libstfl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
