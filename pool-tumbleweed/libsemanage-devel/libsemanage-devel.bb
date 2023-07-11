SUMMARY = "Header files and libraries for SELinux's policy management libary"
DESCRIPTION = "The libsemanage-devel package contains the libraries and header files \
needed for developing applications that manipulate SELinux policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-devel-3.5-1.9.aarch64.rpm"
RPM_HASH = "a1502e750123b788e4d78c694af2fec08fb770107644f1ca784736c29f828e1ea2247f59b63e521a814a5d7cc67314f291302e12123b937747bfc191fe4473ef"

RPROVIDES:${PN} += "libsemanage-devel \
pkgconfig-libsemanage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemanage2 \
pkgconfig-libselinux \
pkgconfig-libsepol"

inherit rpm
