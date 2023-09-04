SUMMARY = "Terminal file manager (with sixel support)"
DESCRIPTION = "lf (as in 'list files') is a terminal file manager written in Go with a \
heavy inspiration from ranger file manager"
LICENSE = "MIT"

PV = "30+dd82949"

RPM_NAME = "lf-30+dd82949-1.1.aarch64.rpm"
RPM_HASH = "d6f859d57f2bbb776970ddf5dbf2d5224742cbd6d11ccc8782e047160d9a3eaa999ae31e916eeccd20ab5b9ee6a3e426247b928f5e0a9725d99377f2cc23a0a7"

RPROVIDES:${PN} += "lf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
