SUMMARY = "Documentation files for python-nss"
DESCRIPTION = "HTML Documentation and examples for python-nss."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python-nss-doc-1.0.1-4.8.aarch64.rpm"
RPM_HASH = "062d1a004c3a4bbd28d486c9ba78d58a2c1c0b9820382530982ad9b98f44223ae6b7477ab363efdb5c20ab78f805e86a33d757d75077d9dd746f32649fc4415d"

RPROVIDES:${PN} += "python-nss-doc"

RDEPENDS:${PN} += ""

inherit rpm
