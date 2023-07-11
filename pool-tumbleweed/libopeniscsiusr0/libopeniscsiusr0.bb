SUMMARY = "The iSCSI User-level Library"
DESCRIPTION = "The iSCSI user-space API from the open-iscsi project."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libopeniscsiusr0-0.2.0-101.1.aarch64.rpm"
RPM_HASH = "46c005217d6a6f6597b6d88fe13682706c6f33a6eb10b2074fe5485d95a394608fa96e83ada606603152f2d8f0fddc7163e596c3449e45d04eefd2fbfdcd4c91"

RPROVIDES:${PN} += "libopeniscsiusr.so.0 \
libopeniscsiusr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2"

inherit rpm
