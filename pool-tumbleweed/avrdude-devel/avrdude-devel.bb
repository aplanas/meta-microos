SUMMARY = "Development files for avrdude"
DESCRIPTION = "This package contains development files for avrdude."
LICENSE = "GPL-2.0+"

PV = "6.3"

RPM_NAME = "avrdude-devel-6.3-5.7.aarch64.rpm"
RPM_HASH = "62015dbfc8d70899c18db66bea441be616e65593ffdda7555663f6306a72c0abb78d75234dced7bafc4e34df6e76b857bc8ef4328500c8f5c38714d5dc5d7315"

RPROVIDES:${PN} += "avrdude-devel"

RDEPENDS:${PN} += "avrdude"

inherit rpm
