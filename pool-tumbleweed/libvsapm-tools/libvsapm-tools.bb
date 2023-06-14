SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsapm to \
inspect Apple Partition Map partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "libvsapm-tools-20210626-4.7.aarch64.rpm"
RPM_HASH = "da24b45d501267286240898270a394dccf552b3602306c3e807bb505ccb893bd51b1f97edcc275407c04f280ce16b38fb9783feacecf5de16c978aaa7f39ac3d"

RPROVIDES:${PN} += "libvsapm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsapm.so.1"

inherit rpm
