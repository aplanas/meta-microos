SUMMARY = "Development files for aml"
DESCRIPTION = "Development files and headers for aml."
LICENSE = "ISC"

PV = "0.3.0"

RPM_NAME = "aml-devel-0.3.0-1.2.aarch64.rpm"
RPM_HASH = "c9b08231e4d11e055ad7ed643b392b9cdbad1fc715a0c7d10131bb2a05a9fec2ef9bc0e25e03d7b0a39de1817b844dca316fe665fcfe8306b00c3fbfb4cfccef"

RPROVIDES:${PN} += "aml-devel aml-devel(aarch-64) pkgconfig(aml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaml0"

inherit rpm
