SUMMARY = "IPv4 and IPv6 Networking Utilities"
DESCRIPTION = "This package contains some small network tools for IPv4 and IPv6 like \
ping, arping and tracepath."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "20221126"

RPM_NAME = "iputils-20221126-2.4.aarch64.rpm"
RPM_HASH = "dfd6898fa73d9e842f31358f17fb9dcec294ea321a4edbf083bacfde22f1a33c155a11117af4fbc350f2599165acfe21461269b68a8e13199667ea4f4094da84"

RPROVIDES:${PN} += "/sbin/arping \
/usr/bin/ping \
iputils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libidn2.so.0 \
permissions"

inherit rpm
