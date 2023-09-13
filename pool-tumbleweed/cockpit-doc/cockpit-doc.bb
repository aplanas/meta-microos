SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-doc-300.1-1.1.noarch.rpm"
RPM_HASH = "ebc8b06786ece3996af551b8711321864bb4cb1a62046a6ea3301b4fd4662b6cb450494aec8fbed86b3107ded84f585f5f604220f5e09268bc7a9be62aeacc84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"

RDEPENDS:${PN} += ""

inherit rpm
