SUMMARY = "System user and group 'velociraptor'"
DESCRIPTION = "This package provides a shared system user for all velociraptor components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-velociraptor-1.0.0-3.3.aarch64.rpm"
RPM_HASH = "6281c92900403089142f19c6d6a4d775b03d46711ee7a238ccf0dc2a4b1a8704b95779fd77f8c514978c1e72061c95836402f86c3228f10110be9000c69560e3"

RPROVIDES:${PN} += "group-velociraptor \
system-user-velociraptor \
user-velociraptor"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
