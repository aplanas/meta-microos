SUMMARY = "Development files for libreplaygain"
DESCRIPTION = "This package includes development files for libreplaygain."
LICENSE = "LGPL-2.1-or-later"

PV = "r475"

RPM_NAME = "libreplaygain-devel-r475-2.14.aarch64.rpm"
RPM_HASH = "0b6454d28dbe5433fd37f4039d519a25ece85ee35a0bec8b2fc44733becdbb0b1fe9fe76cd3e24617fd6b082fb3ebad91a355adcb33f350c1e0e8922cfb770af"

RPROVIDES:${PN} += "libreplaygain-devel"

RDEPENDS:${PN} += "libreplaygain1"

inherit rpm
