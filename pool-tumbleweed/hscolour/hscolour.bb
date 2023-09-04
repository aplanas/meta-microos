SUMMARY = "Colourise Haskell code"
DESCRIPTION = "Hscolour is a small Haskell script to colourise Haskell code. It currently has \
six output formats: ANSI terminal codes (optionally XTerm-256colour codes), \
HTML 3.2 with <font> tags, HTML 4.01 with CSS, HTML 4.01 with CSS and mouseover \
annotations, XHTML 1.0 with inline CSS styling, LaTeX, and mIRC chat codes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "hscolour-1.24.4-4.8.aarch64.rpm"
RPM_HASH = "61553ef6a54481b21f6d3c7149bbf003ccad29e9720c40df5c2926ee20534fe26a4857dcf16dd156caf30712c3d89897dc27e6958fc586f7aafd50d36a583553"

RPROVIDES:${PN} += "hscolour"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
