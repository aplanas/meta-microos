SUMMARY = "Development files for libindi"
DESCRIPTION = "This package contains development files for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "indi-devel-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "08695dafe0b1ec47ffbbbcc84028475ba4b473ddebeb5682b8684f56cb73ceccc8fa796feb5a763faddf257bc8fd8b474c4feac845e2922c715c81827e0d7379"

RPROVIDES:${PN} += "indi-devel \
pkgconfig-libindi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libindiAlignmentDriver1 \
libindiclient1 \
libindiclientqt1 \
libindidriver1 \
libindilx200-1"

inherit rpm
