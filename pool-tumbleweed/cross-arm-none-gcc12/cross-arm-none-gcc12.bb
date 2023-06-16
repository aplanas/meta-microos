SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-none-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "3a7d2c190eb7b976ec04ba1147b09b82271238da8d872ea93c349b154e168d77026ad368631b28803a26d029533c95241db1795914aa18909063a47728d253ae"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
