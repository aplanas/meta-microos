SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-oss-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "59bc16028390802bb2e8702dcb1fad2ca5cd22b072b23af47bb750c7dd91868bd435796406c15e4a2dbd61e5b35b79742c11e5df8859126d4156e11794ee0fe9"

RPROVIDES:${PN} += "qemu-audio-oss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
