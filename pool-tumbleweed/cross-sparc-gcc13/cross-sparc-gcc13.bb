SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-sparc-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "2b6c35a6496e733b4d1b8ab1bde84ac730d4ad7c2502952ba63133576bfabf23a56104fd4bc2c06c09de1d28e71d3fd340c2201bab6d5f1f41624d71fed3e9c5"

RPROVIDES:${PN} += "cross-sparc-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
