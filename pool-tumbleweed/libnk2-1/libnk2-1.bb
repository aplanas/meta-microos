SUMMARY = "Library for accessing the Outlook Nickfile (NK2) format"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-1-20221122-3.5.aarch64.rpm"
RPM_HASH = "c689cbc658c9b76bf39efb0a80b63977a26c38981877073950b71af738a629198c31a8c34dd0c2876d6e98eb5ecec20289097c9d501897d99146258dec281d12"

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
