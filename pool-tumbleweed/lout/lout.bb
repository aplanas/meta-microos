SUMMARY = "A document formatting system"
DESCRIPTION = "Lout is a document formatting system. The system reads a high-level \
description of a document similar in style to LaTeX and produces a \
PostScript file. Plain text output is also available, PDF output is \
limited but working (e.g. no graphics). Either of these may be \
fed to a printer. Lout is offered in multiple languages."
LICENSE = "GPL-2.0-or-later"

PV = "3.42.2"

RPM_NAME = "lout-3.42.2-1.3.aarch64.rpm"
RPM_HASH = "2f1b932946441db6ad3c6cfbc472201924ee5a89a601a905dc6bfb2c1a46379388d06395ec757e1d9cdda0b29ef9dbc03ed02bf95ca63693adbb7db7ccfe7953"

RPROVIDES:${PN} += "lout"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
