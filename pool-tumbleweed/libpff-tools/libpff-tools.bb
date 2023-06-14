SUMMARY = "Tools to access Microsoft PST and OST files"
DESCRIPTION = "Tools to access the Personal Folder File (PFF) and the Offline Folder \
File (OFF) format. These are used in several file types: PAB \
(Personal Address Book), PST (Personal Storage Table) and OST \
(Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff-tools-20230325-1.4.aarch64.rpm"
RPM_HASH = "5d29121b173e967928be39819ed68aefc9666b9d62b88ca28b72821801c7be6c8e4ea64dab03264879918703291df0150d43c1080060507ac997652a02e1b54b"

RPROVIDES:${PN} += "libpff-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfmapi.so.1 \
libfvalue.so.1 \
libpff.so.1 \
libpff1"

inherit rpm
