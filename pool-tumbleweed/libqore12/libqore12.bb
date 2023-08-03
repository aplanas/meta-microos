SUMMARY = "Libraries for the qore runtime and qore clients"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides the qore library required for all clients using qore \
functionality."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "libqore12-1.16.1-1.1.aarch64.rpm"
RPM_HASH = "853f75fea88134fa1b554f5575fab9d3e45976988c96025d282f00474774a6c4d387b4348aa9ef54074510cb7bf341ef49ea35c90d3c78894b35da535c641817"

RPROVIDES:${PN} += "libqore.so.12 \
libqore12 \
qore-module-abi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmpfr.so.6 \
libpcre.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
