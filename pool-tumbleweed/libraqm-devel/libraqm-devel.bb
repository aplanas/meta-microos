SUMMARY = "Complex Textlayout Library"
DESCRIPTION = "Library that encapsulates the logic for complex \
text layout and provides a convenient API."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "libraqm-devel-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "3ada731b36e0c9558676fdd7ce0f1614f8d6c8e6ce305e5a841bac6f5b7b71c673463f2f28fb2c575c16477882007b82f3ebaf56857fa3589c2eadf4c77c7c90"

RPROVIDES:${PN} += "libraqm-devel \
libraqm-devel(aarch-64) \
pkgconfig(raqm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraqm0 \
pkgconfig(freetype2) \
pkgconfig(fribidi) \
pkgconfig(harfbuzz)"

inherit rpm
