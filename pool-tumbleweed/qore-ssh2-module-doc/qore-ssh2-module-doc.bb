SUMMARY = "Documentation and examples for the Qore SSH2 module"
DESCRIPTION = "SSH2 module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.4.2"

RPM_NAME = "qore-ssh2-module-doc-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "2da5b038376117cd52929cf13d75343842f68fd2ae2e462ba622b5856aa21154297ab72454fd317575ef45d63267c60fe1f98740b35e56b5de00fe86fb86739c"

RPROVIDES:${PN} += "qore-ssh2-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
