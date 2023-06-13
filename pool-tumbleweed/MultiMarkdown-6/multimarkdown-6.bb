SUMMARY = "Reference implementation of MultiMarkdown"
DESCRIPTION = "MultiMarkdown is a derivative of Markdown that adds new syntax features, \
such as footnotes, tables, and metadata. Additionally, it offers mechanisms \
to convert plain text into LaTeX in addition to HTML."
LICENSE = "MIT"

PV = "6.6.0"

RPM_NAME = "MultiMarkdown-6-6.6.0-1.11.aarch64.rpm"
RPM_HASH = "e2a5e397b6605bcf1ea1af5a626f44826f1f507ffb08d6d736269d12066e30b6d1024e701622636be16ea700d5365bb5575a4947d886acc31f9eb118aead52e4"

RPROVIDES:${PN} += "MultiMarkdown-6 \
MultiMarkdown-6(aarch-64) \
markdown"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
texlive-filesystem \
update-alternatives"

inherit rpm
