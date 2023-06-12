SUMMARY = "Documentation for entangle"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
Documentation for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-doc-3.0-2.8.noarch.rpm"
RPM_HASH = "ed6c031b131184322cde2572ab59da4c079003b83ae4ac0d5bede5159b6093faf15fc1182e27da7eadd790e2f09a489cb742f9ebc9d2f8637c8953fde389c2a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "entangle-doc"
RDEPENDS:${PN} += "entangle"

inherit rpm
