SUMMARY = "Header files and static libraries from mopac7"
DESCRIPTION = "MOPAC7 is a semi-empirical quantum-mechanics code written by James J. P. \
Stewart and co-workers. The purpose of this project is to maintain MOPAC7 as \
a stand-alone program as well as a library that provides the functionality \
of MOPAC7 to other programs. \
 \
This package contains development files."
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "libmopac7-1-devel-1.15-8.4.aarch64.rpm"
RPM_HASH = "edc5299fbc7d6e93a872db86ef982a8fac768675e8e5c0d33c8ba3ac8351bcf417e02881219d01e5a7fa56687cdfa7c0d2fadb571a681e23a5af8c57e7a46ff6"

RPROVIDES:${PN} += "libmopac7-1-devel \
pkgconfig-libmopac7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmopac7-1"

inherit rpm
