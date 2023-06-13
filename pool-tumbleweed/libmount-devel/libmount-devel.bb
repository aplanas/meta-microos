SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libmount-devel-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "8bcd3480b5b76c02fe6efabe15c86c4fe2dba4f48265ea4e685505c362110b96bb7f4a46149a17f8b3355c727c3cfed9852f1ab5660b4eab723ea92b34819124"

RPROVIDES:${PN} += "libmount-devel \
libmount-devel(aarch-64) \
pkgconfig(mount)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmount1 \
pkgconfig(blkid) \
pkgconfig(libselinux)"

inherit rpm
