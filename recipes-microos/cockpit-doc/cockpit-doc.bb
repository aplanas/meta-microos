SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-doc-276.1-4.3.noarch.rpm"
RPM_HASH = "5e56cb7474bab7a11485fa369532b3fcd0782355eeb50e5442c4db7610585520a8f6e701e3cd300e7de800c0eba1c07f750aaa6e70b3ebfdab70e251d0a2af51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"
RDEPENDS:${PN} += ""

inherit rpm
