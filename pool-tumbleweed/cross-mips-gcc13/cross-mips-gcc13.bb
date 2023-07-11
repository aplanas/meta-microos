SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-mips-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "fde43fb018df82bd635e0ba2fc0de3a7b206b95be34ce796da7ef06450a6c1292044c68d5b56ac5005bffd6c0b9a59ef5b8a1c1fc2a23bc708d62b59e508279c"

RPROVIDES:${PN} += "cross-mips-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
