SUMMARY = "Development files for perl-Tk"
DESCRIPTION = "Development files for Tk - a graphical user interface toolkit for Perl"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "804.036"

RPM_NAME = "perl-Tk-devel-804.036-2.3.aarch64.rpm"
RPM_HASH = "e0b0b947e103f464b1729e37ac1587b23257b2e1d729aa9faff2c875930f0763aff908ca5243ef6ff9f9fc171430904d3d025f957de3cd03326ada020104cac9"

RPROVIDES:${PN} += "perl-Tk-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Tk"

inherit rpm
