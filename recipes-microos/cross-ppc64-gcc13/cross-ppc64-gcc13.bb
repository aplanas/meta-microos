SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "0e0298a126f9173464af4f62ae97aff8406f4be1d3d049def09300ebfdcbc90aedf6bae29ca667cae53e2a261f97653206b74a76a2db70283f227b173b68ce5f"

RPROVIDES:${PN} += "cross-ppc64-gcc13 \
cross-ppc64-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
