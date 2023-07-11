SUMMARY = "Development files for GNU ocrad"
DESCRIPTION = "Development files for GNU ocrad - useful for programs implementing OCR."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "ocrad-devel-0.28-1.8.aarch64.rpm"
RPM_HASH = "751b7c7077434c9cf1d7e86de602c8d19ef3683c13dca6305437b41bc698feec5f8c33b0070595c59f2c6cefe9c6a864b71ca5026c18da63d5babcfdd96dd337"

RPROVIDES:${PN} += "ocrad-devel"

RDEPENDS:${PN} += ""

inherit rpm
