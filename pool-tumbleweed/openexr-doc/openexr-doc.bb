SUMMARY = "Documentation for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "openexr-doc-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "12712783605eb9d359637fecabd092205b0c502f592661dc9659327603f1091f6116af018060f87e794c82649a59fc2397d48763215eb1366c5daed14d58f912"

RPROVIDES:${PN} += "OpenEXR-doc \
openexr-doc"

RDEPENDS:${PN} += ""

inherit rpm
