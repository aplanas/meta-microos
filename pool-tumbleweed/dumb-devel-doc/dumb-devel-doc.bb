SUMMARY = "Doc Package for Dumb"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library. \
 \
This package contains the docs for dumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-devel-doc-2.0.3-1.10.aarch64.rpm"
RPM_HASH = "aaeaf0b700b5b5de185f4613442dd47c35cd43b87f3247b1af9b3212fdeeca73ed105168989dc18891f8a287c2b659cd72ed6133abefd696eb7a1090d752c8c3"

RPROVIDES:${PN} += "dumb-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
