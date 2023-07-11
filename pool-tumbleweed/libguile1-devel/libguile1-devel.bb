SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the files necessary to link against the guile libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile1-devel-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "60982f96c6a03aba7d203cfc3ff23f4d48fc7e4b7f4b27415b16b038c508d4ae00c7248b67edc8f45c46a5565e1819305d89fa618f9d1bd4b3ad3853eff003a4"

RPROVIDES:${PN} += "libguile1-devel \
pkgconfig-guile-1.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
guile1 \
libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-60-v-2-2 \
libguile17 \
libguilereadline-v-17-17 \
libltdl-devel \
ncurses-devel \
readline-devel"

inherit rpm
