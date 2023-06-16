SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-x86_64-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "8b84ef0ed9c7c6379f85b6231d4a94fa30e4e93d7bdbc37ed85af688b7c9656cd55171c3d06441b9a1ceb19efd1d94f0ef786fcf96a50f6dae1304276d3145a6"

RPROVIDES:${PN} += "cross-x86-64-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
