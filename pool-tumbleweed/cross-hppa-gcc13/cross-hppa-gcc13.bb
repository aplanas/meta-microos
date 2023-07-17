SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-hppa-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "1196dc98a9ee7f885ff7b9a114bad40977e0301e6f6a5f491eba6aeecb4fa0ac7783b71ae5ecc012cfa1f28c321c3a9ab3f81191043ef9768cbd301f3fd50327"

RPROVIDES:${PN} += "cross-hppa-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
