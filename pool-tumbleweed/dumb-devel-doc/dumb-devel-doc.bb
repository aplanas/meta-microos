SUMMARY = "Doc Package for Dumb"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library. \
 \
This package contains the docs for dumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-devel-doc-2.0.3-1.9.aarch64.rpm"
RPM_HASH = "09944c8114789e70919ec9374b3097f5aaca30ee334366026d2e8b7296f9d991651d23ba439a7d42adebb35c664a14e87e870f43018a20659945e820b6b8fa41"

RPROVIDES:${PN} += "dumb-devel-doc \
dumb-devel-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
