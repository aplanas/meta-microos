SUMMARY = "Libraries for the qore runtime and qore clients"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides the qore library required for all clients using qore \
functionality."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "libqore12-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "3b873d554406cdd5b0241eda104bda5ae1f12fdaf8321ab71e008b2553f44f9564d63cbe594f98ccd1d9abd3595194f620da4f89666b0570142a53bc95342b69"

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
