SUMMARY = "Miscellaneous scripts for X"
DESCRIPTION = "This package contains miscellaneous scripts for X, like xon, a script \
to start an X program on a remote machine."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xorg-scripts-1.0.1-10.18.noarch.rpm"
RPM_HASH = "773d5428ecb4b85e38d1ff765f9f98e2de9f09e8510ad113aadf9f16f9c6568dbb4b2387834789f0e0104915e9497f10e6f870154ebcff07cda6bc3b803bf9ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-scripts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
