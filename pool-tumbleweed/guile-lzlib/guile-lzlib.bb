SUMMARY = "Guile bindings to lzlib"
DESCRIPTION = "This package provides Guile bindings to lzlib, a data compression library \
providing in-memory LZMA compression and decompression."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.2"

RPM_NAME = "guile-lzlib-0.0.2-1.9.aarch64.rpm"
RPM_HASH = "8d79d41bfb54dd4c151a2a26bbc0eb9b4d60d427d98a48e7d3339fba35484dd6daa70fb234f90ddc196f447e38e3fef7aeee321f25b2151f8525dc26e9635a51"

RPROVIDES:${PN} += "guile-lzlib"

RDEPENDS:${PN} += "guile \
lzlib-devel"

inherit rpm
