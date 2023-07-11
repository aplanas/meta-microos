SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparc64-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "5cbd1bc0a7c84423fc6ad38bd5940ba97b473b2c39dda457f52a699327925ae44de13bebb851cb206692b3e0e90e8c04ab04b85536505e785ccf495c35cbe74e"

RPROVIDES:${PN} += "cross-sparc64-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
