SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "d13b759882870b3342f1f655d80e2a2104c3776ac933a071e0ce13adb536396017061e3f7b66cfea1c60dd14582f4c396cd0a6cfdf7f9c2f9e20320276db3dd3"

RPROVIDES:${PN} += "cross-ppc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
