SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-hppa-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "5c527c5f79d525fbbd3dfb5c07d7afac91205a6878b2ad5b4addaeacfecb57d78fc61f56f1021e1bf0b2f10bf713fb96302d20326fcb50e6372a39c1cb2e5343"

RPROVIDES:${PN} += "cross-hppa-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
