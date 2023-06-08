SUMMARY = "Native application for the browserpass browser extension"
DESCRIPTION = "This is a host application for browserpass browser extension providing it \
access to your password store. The communication is handled through Native \
Messaging API."
LICENSE = "ISC"

PV = "3.1.0"

RPM_NAME = "browserpass-native-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "8d938acb79860ebe03ee8d5b36c662b0088f19c722fd5f4372604e56a9d60d18741f4fab3ec67ff2669e825c44ba7a36c0ee31ce34eabb05d6d616661cd5f654"

RPROVIDES:${PN} += "browserpass-native browserpass-native(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
