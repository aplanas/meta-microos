SUMMARY = "Library for accessing the Outlook Nickfile (NK2) format"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-1-20221122-3.6.aarch64.rpm"
RPM_HASH = "9aa31df8065f9e4542222c35f57525f380162389a458923ae9819dff9f34bf73a1fdfce873d81006e95b287fc900366cb2d53efb68657bb0c6fd3b642979764a"

RPROVIDES:${PN} += "libnk2-1 \
libnk2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
