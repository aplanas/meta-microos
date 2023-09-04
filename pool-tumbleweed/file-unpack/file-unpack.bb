SUMMARY = "Command line tool to unpack anything"
DESCRIPTION = "/usr/bin/file-unpack is a trivial command line frontend that \
ships with the File::Unpack perl module."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.70"

RPM_NAME = "file-unpack-0.70-7.13.aarch64.rpm"
RPM_HASH = "6ae1b46e9e87802f2b088e1a32491d7ee232bff20e13e8acd262a0b2a6cf536d2d62723f338f9b5930dfb92761e4df32b23be4205ec9ef2a1363040d1218d4ea"

RPROVIDES:${PN} += "file-unpack"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl-File--Unpack"

inherit rpm
