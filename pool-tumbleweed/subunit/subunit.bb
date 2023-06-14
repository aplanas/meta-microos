SUMMARY = "C library for the subunit testing protocol"
DESCRIPTION = "Subunit C bindings.  See the python-subunit package for test processing \
functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-1.4.2-2.2.aarch64.rpm"
RPM_HASH = "0dedef3ba32114c5690268d8dcac348ada0d96c4425f916b802a2a76702ea21cdf4858c71a2e27f730ae17f547ad30d93bcd7e1bf5c455a034906cf28e3ea603"

RPROVIDES:${PN} += "subunit"

RDEPENDS:${PN} += ""

inherit rpm
