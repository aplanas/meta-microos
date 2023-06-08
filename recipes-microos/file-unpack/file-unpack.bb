SUMMARY = "Command line tool to unpack anything"
DESCRIPTION = "/usr/bin/file-unpack is a trivial command line frontend that \
ships with the File::Unpack perl module."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.70"

RPM_NAME = "file-unpack-0.70-7.11.aarch64.rpm"
RPM_HASH = "7326f316946c3c583da49f74ab7501a612aa190c0ef66e714efdc8e27706147e046274e1f342e129690c1be24aa89df7b0f411614af394d1c15081acf852a934"

RPROVIDES:${PN} += "file-unpack file-unpack(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl libc.so.6(GLIBC_2.34)(64bit) perl(File::Unpack)"

inherit rpm
