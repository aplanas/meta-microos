SUMMARY = "Development files for jq"
DESCRIPTION = "Development files (headers and libraries for jq)."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.6"

RPM_NAME = "libjq-devel-1.6-3.4.aarch64.rpm"
RPM_HASH = "058db21c38973c25d0c044325965e0c480c12e76492d7506722d4546e57816797aa3b6bfcc85708281b8d9d62b01077b50369c1db208bbdb144f647e030af2c0"

RPROVIDES:${PN} += "libjq-devel"

RDEPENDS:${PN} += "libjq1"

inherit rpm
