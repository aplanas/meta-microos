SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "attica-qt5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "64eb37b15a41690edb1d9aa6649bb494c4d88fdbe1460172f5ad73e968d7dca2900f96a883b0b83f3dcd99fe9afe32f0a84818f171546479fd16c48e066994b4"

RPROVIDES:${PN} += "attica-qt5"

RDEPENDS:${PN} += ""

inherit rpm
