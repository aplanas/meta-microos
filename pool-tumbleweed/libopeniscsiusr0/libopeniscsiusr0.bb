SUMMARY = "The iSCSI User-level Library"
DESCRIPTION = "The iSCSI user-space API from the open-iscsi project."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libopeniscsiusr0-0.2.0-99.1.aarch64.rpm"
RPM_HASH = "660a926d0d35d4c667b65107a6e55cbb895f74def63725625ad4a52843a5d8a5f550314b5abb069dfd7a4d68002d23f545e6b90eb00122fdfbcff831bda3d980"

RPROVIDES:${PN} += "libopeniscsiusr.so.0()(64bit) \
libopeniscsiusr0 \
libopeniscsiusr0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit)"

inherit rpm
