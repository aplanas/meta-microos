SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparc64-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "da16e0f5cc01e4adbc9f6435017e460767e63b3a3752a16883c572278d7f9fc57cef463b7da37d853fa339dfbada8352973e08837855158c56424d83e9839954"

RPROVIDES:${PN} += "cross-sparc64-gcc12 \
cross-sparc64-gcc12(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
