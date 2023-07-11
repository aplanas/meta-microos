SUMMARY = "Library to access Microsoft PFF and OFF format files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff1-20230325-1.7.aarch64.rpm"
RPM_HASH = "e6047e7345b7f5a420ba05f7d18be47a4b7432bf6961aa2eebb0b31ea5a696b644bbf715473a6d11c2303e2a283cd23cd36642e2e37022af9203a86455c25710"

RPROVIDES:${PN} += "libpff.so.1 \
libpff1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfmapi.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
