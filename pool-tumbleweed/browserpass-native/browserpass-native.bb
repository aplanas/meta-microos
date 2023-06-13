SUMMARY = "Native application for the browserpass browser extension"
DESCRIPTION = "This is a host application for browserpass browser extension providing it \
access to your password store. The communication is handled through Native \
Messaging API."
LICENSE = "ISC"

PV = "3.1.0"

RPM_NAME = "browserpass-native-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "b8df86a2809ae1b35f2a216398b335f604f5fb0ff7f5cd9fa0c578de8a2c39de64d724e30396dcfc36df65c758cca93a5a7536d9f8063e0658bd6b5a0f91c8f8"

RPROVIDES:${PN} += "browserpass-native \
browserpass-native(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
