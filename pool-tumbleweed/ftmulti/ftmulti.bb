SUMMARY = "Multiple masters font viewer"
DESCRIPTION = "Multiple masters font viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftmulti-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "696d4d442bf67678c1a7cd53119f376d8a5580aaa76df82d652ff93f96213ae8bdb9b20cab24d1c64f3d485b4df53f0684147dfb2e971529195b337c0c277b7b"

RPROVIDES:${PN} += "ftmulti"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm
