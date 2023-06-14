SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparc-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "bd0811710b08811541776999a311c5170201df8520d0a11331cfb11635e6cee50030c90898ad12c535c99be4744bcf3bc39bc0b68facc6f33a3a7dda0589065a"

RPROVIDES:${PN} += "cross-sparc-gcc12"

RDEPENDS:${PN} += "/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
