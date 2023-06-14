SUMMARY = "Documentation for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "gegl-doc-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "80f8402205587f540555b0b1e935a355aa1fcce60fc3994bc81507f94077257413a8a88a2b614041eb64a4b8761b4bb30996d33f2b846cb6e855522fced3f092"

RPROVIDES:${PN} += "gegl-doc"

RDEPENDS:${PN} += ""

inherit rpm
