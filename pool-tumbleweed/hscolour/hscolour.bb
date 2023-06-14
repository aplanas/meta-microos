SUMMARY = "Colourise Haskell code"
DESCRIPTION = "Hscolour is a small Haskell script to colourise Haskell code. It currently has \
six output formats: ANSI terminal codes (optionally XTerm-256colour codes), \
HTML 3.2 with <font> tags, HTML 4.01 with CSS, HTML 4.01 with CSS and mouseover \
annotations, XHTML 1.0 with inline CSS styling, LaTeX, and mIRC chat codes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "hscolour-1.24.4-4.3.aarch64.rpm"
RPM_HASH = "b6836f5f8e70def1d519c9f8ee6a21fcc37f4072a732b88435a74bbd8ae22aa9f915ebf416d5de5bed4955e686e54a029e2f22827d2655b78cddbde6f71b80d8"

RPROVIDES:${PN} += "hscolour"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
