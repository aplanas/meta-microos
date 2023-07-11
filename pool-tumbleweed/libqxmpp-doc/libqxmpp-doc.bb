SUMMARY = "Qxmpp library documentation"
DESCRIPTION = "This packages provides documentation of Qxmpp library API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp-doc-1.5.3-1.4.noarch.rpm"
RPM_HASH = "2b4ec0dbfbbc9a598d0b0942addec494ebd43b3e740ebc2b672eedd9be63bcef72b4a5b49c4b8ee13b77178ce0fd5230dea317b5c583c49fc08ff7c1dc059372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqxmpp-doc"

RDEPENDS:${PN} += ""

inherit rpm
