SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-x86_64-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "189ce707308041644db4a4fd2e686e2cfb7638de8e01581c3c1923ec789b0f200775ba8d0a5b0b9634b7b8ff3bafdf8728d60d194cb9d52f3fd6f023514fb2da"

RPROVIDES:${PN} += "cross-x86-64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
