SUMMARY = "Development files for Reliable Datagram Sockets"
DESCRIPTION = "This package provides the header needed to use the RDS socket API."
LICENSE = "BSD-3-Clause | GPL-2.0"

PV = "2.0.7"

RPM_NAME = "rds-tools-devel-2.0.7-2.23.aarch64.rpm"
RPM_HASH = "5992830c9789046d39968d2e0f07d5f6b7096940b9b8a8fe1a7bd97856bc56368f805ca9a376a3c20f70938fc1377f3ccef021f8f15df250a023920e33161611"

RPROVIDES:${PN} += "rds-tools-devel \
rds-tools-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
