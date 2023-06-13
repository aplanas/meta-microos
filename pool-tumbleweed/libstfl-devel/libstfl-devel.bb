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

RPM_NAME = "libstfl-devel-0.24-3.15.aarch64.rpm"
RPM_HASH = "98f71c2ac2f2aabf71446fba1cf2afc956639230fceb149e58f83e0480ff639d3bddcdb24c3420e2272bbc56ee9460dc338d8d9d77a9191874a500fcf8690d36"

RPROVIDES:${PN} += "libstfl-devel \
libstfl-devel(aarch-64) \
pkgconfig(stfl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstfl0 \
ncurses-devel"

inherit rpm
