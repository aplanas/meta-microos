SUMMARY = "Development files for fipscheck"
DESCRIPTION = "This package contains development files for fipscheck."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "fipscheck-devel-1.7.0-1.6.aarch64.rpm"
RPM_HASH = "5fcfb42493887089fcf5bfbe9cbb0aac42778b4de5b0548f31b36a206add31f34acc6e2f729a18e18badf052605bd11285ed2a63820caf5f6148397fbfb07a96"

RPROVIDES:${PN} += "fipscheck-devel"

RDEPENDS:${PN} += "libfipscheck1"

inherit rpm
