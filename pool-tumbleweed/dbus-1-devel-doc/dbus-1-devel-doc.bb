SUMMARY = "Developer documentation package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-BUS supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-devel-doc-1.14.8-1.1.noarch.rpm"
RPM_HASH = "739eb09e4b5eb510e67f969779f4620e91bd004958209bd712ecbf95cd9a0780ad90b9cee358706438201c5e49eea5c51c399940f8f91361dd54951a9d9d6895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-1-devel-doc"

RDEPENDS:${PN} += "dbus-1"

inherit rpm
