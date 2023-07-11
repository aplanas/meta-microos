SUMMARY = "A document formatting system"
DESCRIPTION = "Lout is a document formatting system. The system reads a high-level \
description of a document similar in style to LaTeX and produces a \
PostScript file. Plain text output is also available, PDF output is \
limited but working (e.g. no graphics). Either of these may be \
fed to a printer. Lout is offered in multiple languages."
LICENSE = "GPL-2.0-or-later"

PV = "3.42.2"

RPM_NAME = "lout-3.42.2-1.5.aarch64.rpm"
RPM_HASH = "5d7d449a675b1e7b3a6f4c8f941709a97829c0ef1997e91cca791affd26262e36abad1a15e215a3759c9674bf6f91ca6b2df401f6bb8d124611acad50f620c23"

RPROVIDES:${PN} += "lout"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
