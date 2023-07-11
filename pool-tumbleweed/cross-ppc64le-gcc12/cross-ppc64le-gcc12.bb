SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64le-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "1244025456b2fd3e632760a1506ddb189c6c2ce225c8edd03d4ba7f474678970aa4fe5db88fcefa3411896fe38f75ff225a717abb0eea5a1c367fb2c38e3e9d9"

RPROVIDES:${PN} += "cross-ppc64le-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
