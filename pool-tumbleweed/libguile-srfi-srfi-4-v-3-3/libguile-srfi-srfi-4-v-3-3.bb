SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-4-v-3-3-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "87a619103f2f2aee3f832049ff052541047550ad19cff873dcebc5d56e6d05df7be48b2363ad489ec7d251a2a23b2835692b4072f43e08d09a6d20065cbf7328"

RPROVIDES:${PN} += "libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-4-v-3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
