SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde is a library to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde1-20221103-3.9.aarch64.rpm"
RPM_HASH = "77d221ebf84a9de9b0e8e27aa7e984db49c00584e3137618e4a7dc9d45c489b7bc6ab991f7c4ccb0422deffbb26b641f09dbaebb70e4488b848e0190736665e3"

RPROVIDES:${PN} += "libluksde.so.1()(64bit) \
libluksde.so.1(V_20221103)(64bit) \
libluksde1 \
libluksde1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcthreads.so.1()(64bit) \
libcthreads.so.1(V_20220102)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfcrypto.so.1()(64bit) \
libfcrypto.so.1(V_20221229)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
