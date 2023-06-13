SUMMARY = "Router ADVertisement Daemon for IPv6"
DESCRIPTION = "RADVD is the Router ADVertisement Daemon. It sends IPv6 RA packets \
to advertise available IPv6 networks, and is used for automated \
configuration of IPv6 clients."
LICENSE = "BSD-3-Clause"

PV = "2.19"

RPM_NAME = "radvd-2.19-3.3.aarch64.rpm"
RPM_HASH = "73a20f67dfe653db01c2e56f93a82e224833b83d0deb716cb4b184ae3cf353a3f73215344008ed977aa39e29acbc58e154b3ee3996c8d8122d17445cec35105e"

RPROVIDES:${PN} += "config(radvd) \
group(radvd) \
radvd \
radvd(aarch-64) \
user(radvd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(daemon) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
sysuser-shadow"

inherit rpm
