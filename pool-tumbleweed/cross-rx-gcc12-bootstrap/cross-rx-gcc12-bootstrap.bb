SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-rx-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "19e0973dc54b705d27e00cb9aeadbfee39cffa0c3bf396a78920ca652597b4f89f9260c1d9e084684e04726413a7cc6b6655a58bcd4e047ec1e13b9f1f4e6954"

RPROVIDES:${PN} += "cross-rx-gcc12-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
