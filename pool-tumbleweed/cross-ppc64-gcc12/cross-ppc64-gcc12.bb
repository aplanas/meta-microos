SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "1671e2b491a81f82ae6ce10a96b1e7bf85d1f08fe87b0e5ac43d36a8368660e2af614d5685e1d76c4a389f1263b029d871847b6f5e895f9461b9239fea4b94d1"

RPROVIDES:${PN} += "cross-ppc64-gcc12"

RDEPENDS:${PN} += "/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
