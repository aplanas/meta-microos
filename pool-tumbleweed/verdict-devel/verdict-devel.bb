SUMMARY = "Verdict header files"
DESCRIPTION = "This package contains the header files and cmake config files."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "verdict-devel-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "1967c081395df585c162e7153716bd1b10c4c603adb3c955d50852bc69b006035cf35dc3bb7723e29477d2585bef785f01ea696a014a8d6da450244d41976804"

RPROVIDES:${PN} += "cmake-Verdict \
verdict-devel"

RDEPENDS:${PN} += "libverdict1-4"

inherit rpm
