SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-doc-298-2.1.noarch.rpm"
RPM_HASH = "4b425424c4f916ac71dda5382436193f7d0851ef649ab073df21e421495bd5db847fb99152cfbec3fabe98776441ac78a0cc4e91a7f96b1ffd4a6b3dc220016f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"

RDEPENDS:${PN} += ""

inherit rpm
