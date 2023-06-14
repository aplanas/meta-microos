SUMMARY = "Minimalist WWW proxy"
DESCRIPTION = "Tinyproxy is a light-weight HTTP/HTTPS proxy daemon for POSIX \
operating systems. Designed from the ground up to be fast and yet \
small, it is an ideal solution for use cases such as embedded \
deployments where a full featured HTTP proxy is required, but the \
system resources for a larger proxy are unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.1"

RPM_NAME = "tinyproxy-1.11.1-3.3.aarch64.rpm"
RPM_HASH = "0c4cce1da38bd239f5f9778c943065ff3d10fe2aca0661ac9a600029b2294fcda0c4142b673155e1f60a1bc0775cafef566e14bdc5850516032ac204cd426e53"

RPROVIDES:${PN} += "config-tinyproxy \
tinyproxy"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
logrotate"

inherit rpm
