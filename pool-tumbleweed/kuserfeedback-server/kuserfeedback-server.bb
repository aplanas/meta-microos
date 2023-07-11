SUMMARY = "Server component of kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides a server component \
used to collect telemetry and feedback."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-server-1.2.0-1.15.aarch64.rpm"
RPM_HASH = "fe5a63e32a0505019f9874644f003d9201b150f71ae79a8468c629d53b62fa1dbd5e31d67d5ebb04bb4597d0447f77a481832f2114a21f0b60931349455b78bd"

RPROVIDES:${PN} += "kuserfeedback-server"

RDEPENDS:${PN} += "php"

inherit rpm
