SUMMARY = "Documentation for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "openexr-doc-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "53cdaa5bc00fbfad1bdd92a5c75dd88e416010ae810f9c544edbb702322f53cee945e39d2d89afde55cb4f79737756bdc4aa70fe6ef23f3fbbb1d7be4ffa6d90"

RPROVIDES:${PN} += "OpenEXR-doc \
openexr-doc"

RDEPENDS:${PN} += ""

inherit rpm
