SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparc-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "6eeeb524379d71abb6c7ba8307d9d3e9df469a6dd1baf7ce8f883c1afd27c4906afc1b24fa1a14edfac4d9ce4387834d0ba3842ae5bbfe36c201b23583d2c61d"

RPROVIDES:${PN} += "cross-sparc-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
