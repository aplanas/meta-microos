SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsapm to \
inspect Apple Partition Map partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "libvsapm-tools-20210626-4.9.aarch64.rpm"
RPM_HASH = "8f290b520448159a2a9ed8067a1b50173daf2357ee8778b225183cb2d639973225e91085f7b8192d30650638f2cb187ef2858dd6aaa524e64e732bdc94b32b56"

RPROVIDES:${PN} += "libvsapm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsapm.so.1"

inherit rpm
