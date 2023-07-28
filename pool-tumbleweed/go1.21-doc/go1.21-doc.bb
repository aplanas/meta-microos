SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.21rc3"

RPM_NAME = "go1.21-doc-1.21rc3-1.1.aarch64.rpm"
RPM_HASH = "1ea889c6f1b4478c4b2baafad9214eb2c8334665e611c041cbb49d8573abe6a55668a3655d0eb7706ecc2436ae420a748b9fbe9e876a86bf156e9655ddc015c7"

RPROVIDES:${PN} += "go-doc \
go1.21-doc"

RDEPENDS:${PN} += ""

inherit rpm
