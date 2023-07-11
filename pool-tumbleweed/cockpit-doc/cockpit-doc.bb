SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-doc-293-1.1.noarch.rpm"
RPM_HASH = "5827f89c32bf11df42f30ffb5ea2430b5b7b94f714b98f39b76e6a5c3e245a06462ce5cbb10d705c7ef7b63f56d2477dc89dcb13882a6bdfec905be348da7357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"

RDEPENDS:${PN} += ""

inherit rpm
