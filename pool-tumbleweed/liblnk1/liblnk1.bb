SUMMARY = "Library to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "liblnk1-20230716-2.1.aarch64.rpm"
RPM_HASH = "ad815ab97c58646f83cf6cb6c1bb8ce8110058516d54ef7e656b988cc763c37ab5e5acfdc0baf45e49b0a6f36c68a649500a51971155f96b81d4045024150b95"

RPROVIDES:${PN} += "liblnk.so.1 \
liblnk1"

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
