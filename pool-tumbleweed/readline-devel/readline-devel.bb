SUMMARY = "Development files for readline"
DESCRIPTION = "This package contains the header files for the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "readline-devel-8.2-2.4.aarch64.rpm"
RPM_HASH = "5ab797eb509eabb0a374916f90b5f93d6a64b6f61facc700ac03d7ee7fc365320794bc5a8947d0bfae3e450b094d72855f5f98f9475e04b64d196a965d81de35"

RPROVIDES:${PN} += "pkgconfig-history \
pkgconfig-readline \
readline-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreadline8 \
ncurses-devel \
pkgconfig-tinfo"

inherit rpm
