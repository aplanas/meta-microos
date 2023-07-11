SUMMARY = "GPT partitioning and MBR repair software"
DESCRIPTION = "Partitioning software for GPT disks and to repair MBR disks. The \
gdisk, cgdisk, and sgdisk utilities (in the gdisk package) are \
GPT-enabled partitioning tools; the fixparts utility (in the fixparts \
package) fixes some problems with MBR disks that can be created by \
buggy partitioning software."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "gptfdisk-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "75866c724edc7ef81c0013280f7d5ff81822ad578466be87008e1d18c32b0a65bc30135332dc90c936cbb75c3f8047533d398f0ec802e4554568c666e887e540"

RPROVIDES:${PN} += "gdisk \
gptfdisk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libpopt.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
