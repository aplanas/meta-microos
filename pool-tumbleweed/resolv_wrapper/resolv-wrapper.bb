SUMMARY = "A wrapper for DNS name resolving or DNS faking"
DESCRIPTION = "resolv_wrapper makes it possible to contact your own DNS \
implmentation in your test environment. It requires socket_wrapper to be able \
to contact it. If it does not work on a special platform, the wrapper is able to \
fake DNS queries and return valid responses to your application. \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "resolv_wrapper-1.1.8-2.3.aarch64.rpm"
RPM_HASH = "a2cb1ba55edbb626ff206d1a60f688380f16c58986bde653072032fae80eca417dd0b4700479c9da7375611f96e591cd03a5ffa30f00f4fb44a075d33c43e342"

RPROVIDES:${PN} += "cmake-resolv-wrapper \
libresolv-wrapper.so.0 \
pkgconfig-resolv-wrapper \
resolv-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
cmake \
ld-linux-aarch64.so.1 \
libc.so.6 \
pkg-config"

inherit rpm
