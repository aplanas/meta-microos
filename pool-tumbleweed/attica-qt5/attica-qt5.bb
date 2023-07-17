SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "attica-qt5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ddb55a3a0bfda4452a212281e1810e47ca715b7fa8f85be654ecfcfd1a5f81965eec93ebb0f527a3fe980780ec1d3df9b6d2a6427a74ddf2a52edebcf29d6e3c"

RPROVIDES:${PN} += "attica-qt5"

RDEPENDS:${PN} += ""

inherit rpm
