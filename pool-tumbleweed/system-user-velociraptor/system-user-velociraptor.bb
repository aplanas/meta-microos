SUMMARY = "System user and group 'velociraptor'"
DESCRIPTION = "This package provides a shared system user for all velociraptor components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-velociraptor-1.0.0-3.2.aarch64.rpm"
RPM_HASH = "a62f27aa47ea5c9c6e3fabf739593adc6bb0762baacb81cf1676d989854b8cc468fddeaed4fa752237ebdf1008f101f02cddd13c7ba23d9351961bb00012f9db"

RPROVIDES:${PN} += "group(velociraptor) \
system-user-velociraptor \
system-user-velociraptor(aarch-64) \
user(velociraptor)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
