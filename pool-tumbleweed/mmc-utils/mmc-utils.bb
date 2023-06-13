SUMMARY = "Tools for MMC/SD devices"
DESCRIPTION = "Userspace tools for controlling and querying MMC/SD storage devices"
LICENSE = "GPL-2.0-only"

PV = "0.1+git.20230209"

RPM_NAME = "mmc-utils-0.1+git.20230209-1.1.aarch64.rpm"
RPM_HASH = "2266249262aa564c0ebf00c12b69fa6bd8783bbf176c3177ab20658092c3945d0b632b66ab5e7920194529f1f946f40c23024901f6dbc59f601b167a596226da"

RPROVIDES:${PN} += "mmc-utils \
mmc-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
