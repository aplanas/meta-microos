SUMMARY = "Freepascal Compiler examples"
DESCRIPTION = "The fpc-examples package contains examples for Freepascal."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-examples-3.2.2-3.10.noarch.rpm"
RPM_HASH = "c700d478d761051d96304001ce386d21e029635cf9954e860d32ba44e5bcc9a6eded186240163908cb2b68fe374f4bd0136460c0d120cc3dda87c55f18a96b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
