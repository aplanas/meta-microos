SUMMARY = "Malcontent UI library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "libmalcontent-ui-0-0-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "26e886d6cbcb06d63687c70e3f085472ea172cdf3f5b9caff026eddcd16c4e9cd29a071500a83bbeb16ce3b7d375b417c84491c302d030cd2ee06ba7198c2876"

RPROVIDES:${PN} += "libmalcontent-ui-0-0 \
libmalcontent-ui-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libappstream-glib.so.8 \
libc.so.6 \
libflatpak.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmalcontent-0.so.0"

inherit rpm
