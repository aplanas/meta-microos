SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64le-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "6734da74c1d686cd6c4ad37d4d828076ceaf490cdd2176eb489e9283df8583184c08ec5aa6b8e517ce8371254e47a5bf81683ac9255cd746b6b51dee8cff4aed"

RPROVIDES:${PN} += "cross-ppc64le-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
