SUMMARY = "Documentation for Oggz"
DESCRIPTION = "This package contains HTML documentation needed for development using \
liboggz"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "liboggz-doc-1.1.1-15.29.noarch.rpm"
RPM_HASH = "3f96ebc1c66aa61fd46aa2a8259b4970b052b0c79193228b4e0293a6f2163b8fe637d2a13ac30ca296b7b889468b745da3b626966f5e22882c57b87788916021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liboggz-doc"

RDEPENDS:${PN} += "liboggz2"

inherit rpm
