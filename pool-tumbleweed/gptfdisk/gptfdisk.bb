SUMMARY = "GPT partitioning and MBR repair software"
DESCRIPTION = "Partitioning software for GPT disks and to repair MBR disks. The \
gdisk, cgdisk, and sgdisk utilities (in the gdisk package) are \
GPT-enabled partitioning tools; the fixparts utility (in the fixparts \
package) fixes some problems with MBR disks that can be created by \
buggy partitioning software."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "gptfdisk-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "c8bb3f2b40e37fcef511a2ff77cae0465c7b4ea5fa3d3ff96f073ccc4e4f67fb29a08f0a11c24731fbf10c5cd28cafb5b9786888cf430dd5748e8557e188c36a"

RPROVIDES:${PN} += "gdisk \
gptfdisk \
gptfdisk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
