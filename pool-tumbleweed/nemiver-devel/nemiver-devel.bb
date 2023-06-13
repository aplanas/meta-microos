SUMMARY = "Nemiver graphical debugger - Development files"
DESCRIPTION = "Nemiver is a standalone graphical debugger that integrates well in the \
GNOME desktop environment. It currently features a backend which uses \
the well known GNU Debugger gdb to debug C / C++ programs. \
 \
This package contains the development files to build debugger backend."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.6"

RPM_NAME = "nemiver-devel-0.9.6-9.8.aarch64.rpm"
RPM_HASH = "48dcc0b97c63485e0cb4ab3679609a5fe36be179673be3bc9bcd3bd3dd9a16e946461306a509e3cb632435e244a160ea7142fd257831ac38ed8593429bb9cf15"

RPROVIDES:${PN} += "nemiver-devel \
nemiver-devel(aarch-64)"

RDEPENDS:${PN} += "nemiver"

inherit rpm
