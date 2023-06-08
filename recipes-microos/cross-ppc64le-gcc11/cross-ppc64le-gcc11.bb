SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-ppc64le-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "7a1892ae817798e8ccde0a81e59ffccca3d3fb0ed739ccee770af0f16978d13fe51009c0b173836016b3be5f9433f455866d9671884363afa8b4f3638d37a753"

RPROVIDES:${PN} += "cross-ppc64le-gcc11 cross-ppc64le-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-ppc64le-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
