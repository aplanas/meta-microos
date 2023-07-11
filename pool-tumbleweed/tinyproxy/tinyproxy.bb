SUMMARY = "Minimalist WWW proxy"
DESCRIPTION = "Tinyproxy is a light-weight HTTP/HTTPS proxy daemon for POSIX \
operating systems. Designed from the ground up to be fast and yet \
small, it is an ideal solution for use cases such as embedded \
deployments where a full featured HTTP proxy is required, but the \
system resources for a larger proxy are unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.1"

RPM_NAME = "tinyproxy-1.11.1-3.4.aarch64.rpm"
RPM_HASH = "8cdb8827c5f0b8f4415113ce67f847410c098f241cb2d14bd4c8f0cd98efc63d1c0112e5184574f146701505fb00b7cc9e7c00b07d7c865a4aec239911c7b3af"

RPROVIDES:${PN} += "config-tinyproxy \
tinyproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
logrotate"

inherit rpm
