SUMMARY = "Native application for the browserpass browser extension"
DESCRIPTION = "This is a host application for browserpass browser extension providing it \
access to your password store. The communication is handled through Native \
Messaging API."
LICENSE = "ISC"

PV = "3.1.0"

RPM_NAME = "browserpass-native-3.1.0-1.5.aarch64.rpm"
RPM_HASH = "d88da3de19131197a4ff4ff32d424dcc6465f86fb40a17f005ac2c476e2c3e58147be0afe1e19b439e09e9576fb94d6b636dc7ef9646dd66a326177cc3307547"

RPROVIDES:${PN} += "browserpass-native"

RDEPENDS:${PN} += ""

inherit rpm
