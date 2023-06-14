SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde-tools is a project to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-tools-20221103-3.9.aarch64.rpm"
RPM_HASH = "15cca15ea07cadccf3e3d89e3bea6e9ded2a4b23dc8cc87575c710aef2e1e4b83cb1ab155f32e36588449748541723ab61ce5136d074689681d2d6374ddcc610"

RPROVIDES:${PN} += "libluksde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libluksde.so.1"

inherit rpm
