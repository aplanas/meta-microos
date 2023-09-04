SUMMARY = "Private headers for rime"
DESCRIPTION = "This package provides private headers of Rime to build plugins."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime-private-devel-1.7.3-2.20.aarch64.rpm"
RPM_HASH = "49d794e8178c0dc0ee72fcf14c75d2125d243eb1968812811e81c44ea032a495a10208e17d09515bc365c4fb083c202d28b21b87a69c6af53480e4bd0abe3aac"

RPROVIDES:${PN} += "librime-private-devel"

RDEPENDS:${PN} += "librime-devel"

inherit rpm
