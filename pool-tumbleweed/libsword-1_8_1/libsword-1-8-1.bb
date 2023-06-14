SUMMARY = "Shared library for sword"
DESCRIPTION = "This package contains the shared library for applications using sword."
LICENSE = "GPL-2.0-only & Apache-2.0"

PV = "1.8.1"

RPM_NAME = "libsword-1_8_1-1.8.1-1.33.aarch64.rpm"
RPM_HASH = "56776a6a41fba326d3fb68787911332ee737f8b6ccbe1e28f86133a29f27f6e83559efc51396ffc1e43611fcec5bccbf6c5fbe48b4594965b5314293f6e9301a"

RPROVIDES:${PN} += "libsword-1-8-1 \
libsword-1.8.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-core.so.1 \
libcurl.so.4 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
