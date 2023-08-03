SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-sparc64-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "5bd21c04bfe2cb23b407493fd8335a763ead19729fd23c0824cfd06c267efaccb8ee961750ba2b2459eaea3413c8d80004d9601e2bd241b10d60f5b3b51b289b"

RPROVIDES:${PN} += "cross-sparc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
