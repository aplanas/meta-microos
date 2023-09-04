SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde-tools is a project to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-tools-20221103-4.1.aarch64.rpm"
RPM_HASH = "8a13385a000dbdbfab5f8caade28250601ddd7d08dc8c09ebeed1086e514fd16eab34c681c51d6fe76e6dd8f8c97dade92627973ab0c545d6d41bc062c385a46"

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
