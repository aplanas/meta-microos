SUMMARY = "Compare font hinting modes"
DESCRIPTION = "Compare font hinting modes \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftdiff-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "ae7b33409196f1cc28427a0f1e4379adb4f84ddc2ea925d6a51127b924d2930397d33b4dce6d1f8f1edb7cb59b33f80df27d28d08dfd378823296dd5a3ff038b"

RPROVIDES:${PN} += "ftdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm
