SUMMARY = "Systemtap server"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the server component of systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-server-4.9-1.1.aarch64.rpm"
RPM_HASH = "7f284850ed8953d966aef4a734922de80474d4033949b39899de95590761749ac852d8b7e42689a37d4948d00d0e8aa788d0531c6027aa53b8f4c543d79dcd63"

RPROVIDES:${PN} += "systemtap-server \
systemtap-server(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
avahi \
avahi-utils \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.10)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.12.5)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libnss3.so(NSS_3.7)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libssl3.so()(64bit) \
libssl3.so(NSS_3.12.6)(64bit) \
libssl3.so(NSS_3.2)(64bit) \
libssl3.so(NSS_3.7.4)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
mozilla-nss-tools \
systemtap \
unzip \
zip"

inherit rpm