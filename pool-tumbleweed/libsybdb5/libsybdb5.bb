SUMMARY = "FreeTDS standalone driver with classic API"
DESCRIPTION = "db-lib is the oldest and simplest API, and the only API supported by \
both vendors, which has some relevance when porting applications that \
use the vendors' libraries. db-lib was the first API implemented by \
FreeTDS, and is still the best one supported. Anything that can be \
done in FreeTDS can be done through db-lib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "libsybdb5-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "0d9d0bc219392607e622049d9be45af49312c38ba1b653e125e65704d96e0094ed77f8469249c74fe7f66e1521a9de7d6729ea4715a9a410f62e87bd56212f3a"

RPROVIDES:${PN} += "libsybdb.so.5()(64bit) \
libsybdb5 \
libsybdb5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
