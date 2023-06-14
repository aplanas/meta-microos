SUMMARY = "Library for access the Windows Hibernation File format"
DESCRIPTION = "libhibr is a library to access the Windows Hibernation File \
(hiberfil.sys) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr1-20210421-3.5.aarch64.rpm"
RPM_HASH = "ae11c74aea75d4a6fc133fc9a1dc963a84dafc6601862a784105a9796a3dd9b511088ccaa394ade8f37294657edb3ad6b5e357ff63d2211172f1708b3b154d45"

RPROVIDES:${PN} += "libhibr.so.1 \
libhibr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1"

inherit rpm
