SUMMARY = "Malcontent system library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "libmalcontent-0-0-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "3a36fb99e5a5566309ff7572e8b5ac4edd7e0027df5e9244078fe5de3b7bf097c70bba52f49bcb0f2cb5fd8be05d5668a780392d01d194684ae914e59cff6bfc"

RPROVIDES:${PN} += "libmalcontent-0-0 \
libmalcontent-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
malcontent"

inherit rpm
