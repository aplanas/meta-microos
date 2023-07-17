SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde-tools is a project to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-tools-20221103-3.12.aarch64.rpm"
RPM_HASH = "334f5126598c20009123139c708675ed56f934766c124b10943697ac57ace7029d8a005c176bcad6d0265acf8792d4c481c106a294e16c41bec241c10ada6289"

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
