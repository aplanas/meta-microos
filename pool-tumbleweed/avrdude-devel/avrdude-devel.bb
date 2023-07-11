SUMMARY = "Development files for avrdude"
DESCRIPTION = "This package contains development files for avrdude."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "avrdude-devel-7.1-1.1.aarch64.rpm"
RPM_HASH = "d8b37014bccf104c87e88882b0e0d8e7224b4684c02dfb653c5e166181fe5d7b22f6538cda306ddbd69372601403f99c0cd2762cbb7454b10febd48fcbcec28b"

RPROVIDES:${PN} += "avrdude-devel"

RDEPENDS:${PN} += "avrdude"

inherit rpm
