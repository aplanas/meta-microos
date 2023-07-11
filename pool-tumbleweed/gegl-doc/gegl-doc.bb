SUMMARY = "Documentation for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.46"

RPM_NAME = "gegl-doc-0.4.46-1.1.aarch64.rpm"
RPM_HASH = "38d613d41cb86639a3bf1173533cd0e7c08d7b485b9823a836ac48e5b1e787e4312a18377b049252322edc4d90f1b168cd0d88efa3d12571af7efd8f66ae4423"

RPROVIDES:${PN} += "gegl-doc"

RDEPENDS:${PN} += ""

inherit rpm
