SUMMARY = "Development files for perl-Tk"
DESCRIPTION = "Development files for Tk - a graphical user interface toolkit for Perl"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "804.036"

RPM_NAME = "perl-Tk-devel-804.036-2.2.aarch64.rpm"
RPM_HASH = "362686a753bc733f6c73b52a93b217683f901d351f9f4380fdfa2eb964b42b30d784521bbb8844ca59a30a8066cf37fea3d8b6cd6fae56d022c576bd6292eccd"

RPROVIDES:${PN} += "perl-Tk-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Tk"

inherit rpm
