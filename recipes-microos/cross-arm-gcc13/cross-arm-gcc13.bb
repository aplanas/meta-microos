SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "f0eeaf07cbee97d9bf84c27c697cf03da95c13a97fc3732702d98c0d152b2a216b37f71897804f76059c1ba2605c2a52366e2abbedf14339c7d57ed60243c3e1"

RPROVIDES:${PN} += "cross-arm-gcc13 \
cross-arm-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
