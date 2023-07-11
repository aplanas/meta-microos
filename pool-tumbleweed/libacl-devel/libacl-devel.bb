SUMMARY = "Header files for the POSIX ACL library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libacl."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "libacl-devel-2.3.1-2.13.aarch64.rpm"
RPM_HASH = "08d8d9da4d129eed0e57d5bde30afa6e0505f02ce7187b30d893e207c801bbe7db76ca6256bd8d1dbdbfd9f479c5fe47ba70cc7ccab1b6c3e0f84a988d56a3ec"

RPROVIDES:${PN} += "acl-devel \
libacl-devel \
pkgconfig-libacl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libacl1"

inherit rpm
