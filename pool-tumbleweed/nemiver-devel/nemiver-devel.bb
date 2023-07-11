SUMMARY = "Nemiver graphical debugger - Development files"
DESCRIPTION = "Nemiver is a standalone graphical debugger that integrates well in the \
GNOME desktop environment. It currently features a backend which uses \
the well known GNU Debugger gdb to debug C / C++ programs. \
 \
This package contains the development files to build debugger backend."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.6"

RPM_NAME = "nemiver-devel-0.9.6-9.9.aarch64.rpm"
RPM_HASH = "dcc8dfe203e84afdc37ee788cb29b035a29797b7c1faecd5404e5e963390e3cc2fc2e8709a898b00c92293cc7f5e8a48afdc2595b223e557dabc48de8ccc7277"

RPROVIDES:${PN} += "nemiver-devel"

RDEPENDS:${PN} += "nemiver"

inherit rpm
