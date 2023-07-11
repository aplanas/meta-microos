SUMMARY = "Multiple masters font viewer"
DESCRIPTION = "Multiple masters font viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftmulti-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "454a57732148bd00a0d37e343a1c9f52b4312ecc1b1620c8050fb4ea430d767812c2219996c86dc421a952f7f42ec5be28434cbbacb6f6f3d04d51f6ad7f2a99"

RPROVIDES:${PN} += "ftmulti"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm
