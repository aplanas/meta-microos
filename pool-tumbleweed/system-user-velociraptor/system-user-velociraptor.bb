SUMMARY = "System user and group 'velociraptor'"
DESCRIPTION = "This package provides a shared system user for all velociraptor components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-velociraptor-1.0.0-4.1.aarch64.rpm"
RPM_HASH = "b63282828b4d26188d5690f3268fef63783846a5a030a558b364bf4b07800b372a6740ea80c050d4301569249e009f6641acc2f4b7df2773846f934b37dc75a6"

RPROVIDES:${PN} += "group-velociraptor \
system-user-velociraptor \
user-velociraptor"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
