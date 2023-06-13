SUMMARY = "Utilities for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "Several tools for reading and writing EWF files. \
It contains tools to acquire, verify and export EWF files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf-tools-20230212-2.3.aarch64.rpm"
RPM_HASH = "0f83fdfbdcd34c60a1dd32f4813b06bf6f8df31adcd70163a1dc14eea42b8f163573738c0593c163d953e4ba1f8eafa37db0c38ef22951ec3c8010d38ca59f44"

RPROVIDES:${PN} += "libewf-tools \
libewf-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcdatetime.so.1()(64bit) \
libcdatetime.so.1(V_20230115)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcfile.so.1()(64bit) \
libcfile.so.1(V_20220106)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libcsplit.so.1()(64bit) \
libcsplit.so.1(V_20220109)(64bit) \
libcthreads.so.1()(64bit) \
libcthreads.so.1(V_20220102)(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libodraw.so.1()(64bit) \
libodraw.so.1(V_20210503)(64bit) \
libsmdev.so.1()(64bit) \
libsmdev.so.1(V_20221028)(64bit) \
libsmraw.so.1()(64bit) \
libsmraw.so.1(V_20230320)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit) \
python3-fuse"

inherit rpm
