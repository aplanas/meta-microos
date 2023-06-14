SUMMARY = "Development Files for libspiro"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libspiro."
LICENSE = "GPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libspiro-devel-20221101-1.2.aarch64.rpm"
RPM_HASH = "e835d2cb6a148db04f0c75122415a149cbe14b8a8c42397ade5d6088fd6730ad3aea8b91009006bb3245c34b881d11adc8c1ed8273cc047ca3afe0e8bc03fa2d"

RPROVIDES:${PN} += "libspiro-devel \
pkgconfig-libspiro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libspiro1"

inherit rpm
