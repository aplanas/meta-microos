SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-hppa-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "01e428acdc8d2653c776cb95ca73db669667c7713ef6c67b7df23291f965a070001fd2c5f49ad5ff0ee15a2aa2599de85ec88c908860460e57a8988e27d4638b"

RPROVIDES:${PN} += "cross-hppa-gcc12"

RDEPENDS:${PN} += "/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
