SUMMARY = "Support libraries for GVM"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wmiclient1-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "a5f06f597be596a9668e3629f7e442e173f9a7b3868eff87f531482f579cc81f6a417c1a79e19a051a9eb20a7992ac7bf834bd802473c262de2e56f002c16dd8"

RPROVIDES:${PN} += "libopenvas-wmiclient.so.1 \
libopenvas-wmiclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libgnutls.so.30 \
libgssapi.so.3 \
libhdb.so.9 \
libkrb5.so.26 \
libpopt.so.0"

inherit rpm
