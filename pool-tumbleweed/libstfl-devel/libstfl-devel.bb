SUMMARY = "Structured Terminal Forms Library"
DESCRIPTION = "STFL is a library which implements a curses-based widget set for text \
terminals. The STFL API can be used from C, SPL, Python, Perl and Ruby. \
The API has only 14 function calls and generic SWIG bindings exist \
already for porting STFL to other scripting languages. \
 \
A special language (the Structured Terminal Forms Language) is used to \
describe STFL GUIs."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "libstfl-devel-0.24-3.16.aarch64.rpm"
RPM_HASH = "766b4404b707ad6fee8a3f8c69eb815c822c66f3540d028f2ed9ed6568739413dda2e58a2c727227c6f6dfc8363d5b217a9bc02ed71f765c13c7668d01bd9b36"

RPROVIDES:${PN} += "libstfl-devel \
pkgconfig-stfl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstfl0 \
ncurses-devel"

inherit rpm
