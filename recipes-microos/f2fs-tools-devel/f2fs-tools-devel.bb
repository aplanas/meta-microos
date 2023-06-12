SUMMARY = "Development files for f2fs"
DESCRIPTION = "This package contains development files for f2fs-tools."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "f2fs-tools-devel-1.15.0-2.3.aarch64.rpm"
RPM_HASH = "48c4b591e6a7ae029279e635863d501f82720ec23514bc97ef98c60e4c1316a9009be87afdd4387a558d76edd326a21f1831aba3c9376515b29fcfcc08d1a7f8"

RPROVIDES:${PN} += "f2fs-tools-devel \
f2fs-tools-devel(aarch-64)"
RDEPENDS:${PN} += "libf2fs9 \
libf2fs_format8"

inherit rpm
