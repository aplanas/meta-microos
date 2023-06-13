SUMMARY = "Tools to access Microsoft PST and OST files"
DESCRIPTION = "Tools to access the Personal Folder File (PFF) and the Offline Folder \
File (OFF) format. These are used in several file types: PAB \
(Personal Address Book), PST (Personal Storage Table) and OST \
(Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff-tools-20230325-1.4.aarch64.rpm"
RPM_HASH = "5d29121b173e967928be39819ed68aefc9666b9d62b88ca28b72821801c7be6c8e4ea64dab03264879918703291df0150d43c1080060507ac997652a02e1b54b"

RPROVIDES:${PN} += "libpff-tools \
libpff-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
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
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfmapi.so.1()(64bit) \
libfmapi.so.1(V_20230408)(64bit) \
libfvalue.so.1()(64bit) \
libfvalue.so.1(V_20220120)(64bit) \
libpff.so.1()(64bit) \
libpff.so.1(V_20230325)(64bit) \
libpff1"

inherit rpm
