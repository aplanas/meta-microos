SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-doc-276.1-4.4.noarch.rpm"
RPM_HASH = "3b69d106804a332e31a6cefe6a56c7d238b97d3a23b95a7bb37ead648ef390352e6361af042e44706f9b9d6a08e03583f00aa5e6374c20496589f78793c561b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"
RDEPENDS:${PN} += ""

inherit rpm
