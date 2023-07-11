SUMMARY = "Library for manipulating memory bitmaps"
DESCRIPTION = "This package contains libraries for manipulating memory bitmaps."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "libpainter0-0.9.20-8.1.aarch64.rpm"
RPM_HASH = "752bf47e952f70059a93aa725241c5901388f782ee6514661d468159755934d5ecb2f45da9741a76dfcff0fb23d4d0e581ae1c6c53261297ec9c2f88b7a659d8"

RPROVIDES:${PN} += "libpainter.so.0 \
libpainter0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
