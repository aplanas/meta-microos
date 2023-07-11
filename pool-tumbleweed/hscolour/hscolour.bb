SUMMARY = "Colourise Haskell code"
DESCRIPTION = "Hscolour is a small Haskell script to colourise Haskell code. It currently has \
six output formats: ANSI terminal codes (optionally XTerm-256colour codes), \
HTML 3.2 with <font> tags, HTML 4.01 with CSS, HTML 4.01 with CSS and mouseover \
annotations, XHTML 1.0 with inline CSS styling, LaTeX, and mIRC chat codes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "hscolour-1.24.4-4.6.aarch64.rpm"
RPM_HASH = "805b953878d770d193ad7b5dac5860d10c70bdd925f99003c324784030b4d4f5d223ee6e2743324ea8682a99470e60a6472a713046fe0214a885c9883028636a"

RPROVIDES:${PN} += "hscolour"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
