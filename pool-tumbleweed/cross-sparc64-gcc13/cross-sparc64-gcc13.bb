SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparc64-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "0c4f82cb605deae32d6126eb4fb578c4c87395d2ab5e7bcfd9bfeb11f7582e48b0826ba787fc903ebbce675a7aa3e207632b7fdeefe368cbcde5357692982fea"

RPROVIDES:${PN} += "cross-sparc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
