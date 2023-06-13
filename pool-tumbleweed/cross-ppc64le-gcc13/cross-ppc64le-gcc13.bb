SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64le-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "acc999d5c9247e12c8aa7543bce9de9d8121d0a7a1fada608ecb39e9459769c8b63da9b29efc92d8fcaa17507dc68829f49c7d59dec8daffbc1fe1ff4e9288ec"

RPROVIDES:${PN} += "cross-ppc64le-gcc13 \
cross-ppc64le-gcc13(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
