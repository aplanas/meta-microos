SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-doc-298-1.1.noarch.rpm"
RPM_HASH = "bf01b03d97fd2a0e573c856e9dc7683cf7bbbe5ba9ebfdad79fba83b482583201e8f7f0624e9af19278d1228ac257196d01faff122ecf954f3bb9626986670c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"

RDEPENDS:${PN} += ""

inherit rpm
