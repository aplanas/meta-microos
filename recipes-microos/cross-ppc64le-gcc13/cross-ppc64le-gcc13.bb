SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-ppc64le-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "36518f61fb823fb48bfec65ab04946af2a815a7522efeb52b2c4014a7f51d8fdeaa13b332d9aa713dbaffa07bcac4c11c83768674a3e12649d6964cbfbdb4c41"

RPROVIDES:${PN} += "cross-ppc64le-gcc13 cross-ppc64le-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-ppc64le-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
