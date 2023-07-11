SUMMARY = "Run FreeType benchmarks"
DESCRIPTION = "Run FreeType benchmarks \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftbench-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "c617cde5c33b4612a221073ee52285bba051bb684156d9318b84745f1ed6339bd4488f4fdf111a32219fb4937e662a35396a5b610afacf2f257adc275e5180d1"

RPROVIDES:${PN} += "ftbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
