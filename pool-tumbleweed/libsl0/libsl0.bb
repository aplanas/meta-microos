SUMMARY = "Implementation of a suggestion lister"
DESCRIPTION = "This package contains a library that suggests commands in a 'did you \
mean' fashion."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libsl0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "5e4a9c80b38002dc023ee07c43d9129a60a3160dce0d39546da0d8b89bb352e4e5b13f912d55e525105ecf847216c15f00ccf9b8e4732ab215ea0ec36fb347a8"

RPROVIDES:${PN} += "libsl.so.0()(64bit) \
libsl0 \
libsl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libheimedit.so.0()(64bit)"

inherit rpm
