SUMMARY = "Command line tools for libmetaio"
DESCRIPTION = "This package contains command-line utilities such as lwtprint to be used with libmetaio."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "metaio-utils-8.5.1-1.9.aarch64.rpm"
RPM_HASH = "91a0e7048a854faf5981a421555ada82819d162ca7585a3431d9af721a912c0ad196a04ab23bbd7ebe582f52c4327d60d3a26eff49a3dc60097d96366ec8c165"

RPROVIDES:${PN} += "metaio-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetaio.so.1"

inherit rpm
