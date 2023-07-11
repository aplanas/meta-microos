SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-x86_64-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "2b1c2fb705f1b6abf74f4f37dca39bafd7e7e3d899dbe15cb85c9448f2dfaef89b26815433ca12e2854e04b84153ac58350edfb940815d5d387115f64ea596f5"

RPROVIDES:${PN} += "cross-x86-64-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
