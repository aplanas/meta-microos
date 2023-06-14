SUMMARY = "Development package for FreeIPMI"
DESCRIPTION = "Development package for FreeIPMI.  This package includes the FreeIPMI \
header files and static libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "freeipmi-devel-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "423dff9433aa72b69860e8d1be93e8141e86acc7d74b4d47af75ec485603bbbf36b0855a14731012c3285a725e1683c75889d5971f6c624174b65e62149c8049"

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
