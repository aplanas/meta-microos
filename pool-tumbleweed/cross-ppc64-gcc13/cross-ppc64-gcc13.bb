SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-ppc64-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "173ffabc2cce6c164e9125d3838de636b4d8ca30051f0e4a3080ae6e29e77aac84f101b69b0ac12a9c69693d1d3e904682b20f108cba397a86773223726a19ce"

RPROVIDES:${PN} += "cross-ppc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
