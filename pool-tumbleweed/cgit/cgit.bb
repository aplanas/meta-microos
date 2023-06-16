SUMMARY = "A web frontend for git repositories"
DESCRIPTION = "A web interface for the Git SCM, using a built-in cache to decrease server \
I/O pressure."
LICENSE = "GPL-2.0"

PV = "1.2.3"

RPM_NAME = "cgit-1.2.3-1.16.aarch64.rpm"
RPM_HASH = "eaae994ffa90ebd0c23474ceb46784172caf8bf3655b3498f4a884ea75663553df282ec7cd9630eb9965578bf729234688dcb603fec05b58600e662e475b80ca"

RPROVIDES:${PN} += "bundled-git \
cgit \
config-cgit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
