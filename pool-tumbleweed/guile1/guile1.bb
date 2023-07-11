SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "guile1-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "66f1fba2c5b41a9c144abcda7156b4071870adf0e5e388435cf9c8b8e17b3ef58ab36af6a69a72660e90369420ddef74743f87198a7c3666ba287f0d68146a3c"

RPROVIDES:${PN} += "guile1"

RDEPENDS:${PN} += "/usr/bin/sh \
fileutils \
libc.so.6 \
libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-60-v-2-2 \
libguile.so.17 \
libguile17 \
libguilereadline-v-17-17 \
sh-utils"

inherit rpm
