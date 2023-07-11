SUMMARY = "Tutorial for javassist"
DESCRIPTION = "Tutorial for javassist. \
 \
Tutorial for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-manual-3.29.2-2.1.noarch.rpm"
RPM_HASH = "d0185aa6910d978fc32aba3b765244d8a25e4544457c15e8b4926d647fcc395a10f3487c20f7d040c318f5f5545befa23fc732e1baceba3461f599144235f314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-manual"

RDEPENDS:${PN} += ""

inherit rpm
