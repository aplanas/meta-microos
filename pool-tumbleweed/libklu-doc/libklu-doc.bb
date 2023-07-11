SUMMARY = "Documentation for libklu"
DESCRIPTION = "Documentation for libklu."
LICENSE = "LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "libklu-doc-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "c0ca5cb37d4330bd5d374f6e01ef10fde1cabf83f5a7dcc8dbb6e224e21178402d5524f91db5c900c3c5489dca0dc2b8246fba2182998ced07925401f708e1c9"

RPROVIDES:${PN} += "libklu-doc"

RDEPENDS:${PN} += ""

inherit rpm
