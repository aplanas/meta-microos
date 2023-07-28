SUMMARY = "Documentation for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "openexr-doc-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "ebd0de11b4ca83100350e0837e7547e72cd4abd047ad6da457bfd228ead058ba0cec71f527ddfbc93ee0b1fcd9a9a24d8b94baa748df95342faeed5d9229eb70"

RPROVIDES:${PN} += "OpenEXR-doc \
openexr-doc"

RDEPENDS:${PN} += ""

inherit rpm
