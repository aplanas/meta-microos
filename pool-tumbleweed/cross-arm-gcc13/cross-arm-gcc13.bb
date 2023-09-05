SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "3cfa84f3717d7345a046cb218ba94bfc4bf79830ed641e36498e12093d6f71fecbc97369a0422a037f9c28a9fe190ad66954a913275360c00ab77d0f01572c4c"

RPROVIDES:${PN} += "cross-arm-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
