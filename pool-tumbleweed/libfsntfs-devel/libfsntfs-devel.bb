SUMMARY = "Development files for libfsntfs"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsntfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs-devel-20230606-2.1.aarch64.rpm"
RPM_HASH = "b03c54eaf0788eed850532c861e1e94b1e7b1d788354f7f023c88eff4876604660da3ec2abde1f63d169df63c7c48f251ead26dcd6a2092114f67c4e144f97c7"

RPROVIDES:${PN} += "libfsntfs-devel \
pkgconfig-libfsntfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsntfs1"

inherit rpm
