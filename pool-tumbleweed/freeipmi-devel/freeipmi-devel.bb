SUMMARY = "Development package for FreeIPMI"
DESCRIPTION = "Development package for FreeIPMI.  This package includes the FreeIPMI \
header files and static libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "freeipmi-devel-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "e5d3daf4f94dfc58b1df10121bb6826fcee8e7d186b02b196db0f3672e5c381f29db3722b17e1fd1b83e7bb5fe1a4c2d2b5204e285643148f27571d9b5f1a0c8"

RPROVIDES:${PN} += "freeipmi-devel \
pkgconfig-libfreeipmi \
pkgconfig-libipmiconsole \
pkgconfig-libipmidetect \
pkgconfig-libipmimonitoring"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freeipmi \
libfreeipmi17 \
libipmiconsole2 \
libipmidetect0 \
libipmimonitoring6"

inherit rpm
