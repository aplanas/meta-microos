SUMMARY = "Header files and libraries for SELinux's policy management libary"
DESCRIPTION = "The libsemanage-devel package contains the libraries and header files \
needed for developing applications that manipulate SELinux policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-devel-3.5-2.1.aarch64.rpm"
RPM_HASH = "eee1eda10cbb85cd9eabb89ee1f905e25e8cdb9313ece8d15ff24f1f1ad9f3565db4cc8a3d1bc819c00ee700dd671a53c0d82008d6391915f8a360adcfce0351"

RPROVIDES:${PN} += "libsemanage-devel \
pkgconfig-libsemanage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemanage2 \
pkgconfig-libselinux \
pkgconfig-libsepol"

inherit rpm
