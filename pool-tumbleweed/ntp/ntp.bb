SUMMARY = "Network Time Protocol daemon (version 4)"
DESCRIPTION = "The Network Time Protocol (NTP) is used to synchronize the time of a \
computer client or server to another server or reference time source, \
such as a radio, satellite receiver, or modem. \
 \
Ntpd is an operating system daemon that sets and maintains the system \
time-of-day synchronized with Internet standard time servers."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p17"

RPM_NAME = "ntp-4.2.8p17-1.1.aarch64.rpm"
RPM_HASH = "9ee0de3ef4872d4fbbd1c2f77be86fa9a60b74a3b92ecdc44efa7b2b722810617a19609801099ae34498a8ca56275f31cc51d55be4bcefd080d58d948bc0f504"

RPROVIDES:${PN} += "config-ntp \
ntp \
ntp-daemon \
perl-NTP--Util \
xntp \
xntp3"

RDEPENDS:${PN} += "/usr/bin/base64 \
/usr/bin/bash \
/usr/bin/gawk \
/usr/bin/logger \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-sd.so.1 \
libevent-core-2.1.so.7 \
libm.so.6 \
libreadline.so.8 \
timezone \
user-ntp"

inherit rpm
