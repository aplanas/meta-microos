SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "guile1-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "b1e1519e643f5682d8eed6a5abc598bae1fc0acac187df7a0ad9fca9638dd2e759a56fe361d9b146b8210b704781c519dd3168bb975a99e084df101213fe2b24"

RPROVIDES:${PN} += "guile1 \
guile1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fileutils \
libc.so.6(GLIBC_2.34)(64bit) \
libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-60-v-2-2 \
libguile.so.17()(64bit) \
libguile17 \
libguilereadline-v-17-17 \
sh-utils"

inherit rpm
