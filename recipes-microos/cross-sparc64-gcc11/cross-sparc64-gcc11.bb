SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-sparc64-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "cb3ae6e93db96623a7d17230702dcafceaaf3a84d6629d960bdc20538a7a6291d2257cc791297ec4dcb7f4ac696152f3dcc1164da65a513aa629e52ecd3352d3"

RPROVIDES:${PN} += "cross-sparc64-gcc11 cross-sparc64-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-sparc64-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
