SUMMARY = "Documentation for siproxd"
DESCRIPTION = "HTML and PDF documentation for siproxd"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "siproxd-doc-0.8.3-3.12.aarch64.rpm"
RPM_HASH = "adf4c2ade775b0db825da27b5726d43317d57bb6296d245f9fcb0f7876d2c9c46d6b27217e51cf7554a222fdcb9701fdc2a396087b86548dc84c64a5111c5b16"

RPROVIDES:${PN} += "siproxd-doc"

RDEPENDS:${PN} += ""

inherit rpm
