SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "The libfvde library is a library to access the File Vault Drive Encryption format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde1-20220915-3.11.aarch64.rpm"
RPM_HASH = "f579c9daa7aec9c4d0fc6337f8d613282bb49906eeb7d56f6a3bb01c2e068be768577ae7de9eaa582bbf17630a5f4e7ec6f4a6cb93e2709a14c0fc1c08725466"

RPROVIDES:${PN} += "libfvde.so.1()(64bit) \
libfvde.so.1(V_20220915)(64bit) \
libfvde1 \
libfvde1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
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
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfplist.so.1()(64bit) \
libfplist.so.1(V_20220116)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit) \
libz.so.1()(64bit)"

inherit rpm
