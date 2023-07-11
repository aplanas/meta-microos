SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde-tools is a project to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-tools-20221103-3.11.aarch64.rpm"
RPM_HASH = "a28a1643c8b8b6a00726d1c4dfff283186fcbfa4726eedd1a3402c89676d68c0511328aa20b736a4bf4426ce03876c2f6024e7388a6ecce092d0a53937e35ad1"

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
