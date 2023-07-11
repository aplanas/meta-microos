SUMMARY = "Optional tool for libjcat"
DESCRIPTION = "This package provides the optional jcat-tool for libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.14"

RPM_NAME = "jcat-tool-0.1.14-1.1.aarch64.rpm"
RPM_HASH = "3c1ea42f8f034c0aad8d34e1f3614206b8daac7264389d819d4da24e992d964974c823c30a8b26328837adceb4144e3b8811383a468d67943df49a02708c2404"

RPROVIDES:${PN} += "jcat-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.11 \
libhogweed.so.6 \
libjcat.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
