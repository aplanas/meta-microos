SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-rx-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "11419442f16da81e0ab004fbae93809f2f92f6b757b9e9b9aff3822497c76f880d97c867542d42a5ab1036c095db43b0fba31aa37048d71ac7686931ead05095"

RPROVIDES:${PN} += "cross-rx-gcc12 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
