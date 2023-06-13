SUMMARY = "Header files and static libraries from mopac7"
DESCRIPTION = "MOPAC7 is a semi-empirical quantum-mechanics code written by James J. P. \
Stewart and co-workers. The purpose of this project is to maintain MOPAC7 as \
a stand-alone program as well as a library that provides the functionality \
of MOPAC7 to other programs. \
 \
This package contains development files."
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "libmopac7-1-devel-1.15-8.3.aarch64.rpm"
RPM_HASH = "e2c7097adf7e15ad31b22c760ec57d2ce41accd64dae4ec81bfaa1593aa70f0d23ba8f5793216b437be86e06347bcd706d6786759e5cd996399d62d253d453a6"

RPROVIDES:${PN} += "libmopac7-1-devel \
libmopac7-1-devel(aarch-64) \
pkgconfig(libmopac7)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmopac7-1"

inherit rpm
