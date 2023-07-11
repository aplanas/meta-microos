SUMMARY = "Reference implementation of MultiMarkdown"
DESCRIPTION = "MultiMarkdown is a derivative of Markdown that adds new syntax features, \
such as footnotes, tables, and metadata. Additionally, it offers mechanisms \
to convert plain text into LaTeX in addition to HTML."
LICENSE = "MIT"

PV = "6.6.0"

RPM_NAME = "MultiMarkdown-6-6.6.0-1.12.aarch64.rpm"
RPM_HASH = "fa1aafcd9776a8afefe665b44b94e621ef67ad7e594363bf727497a03807d5a7476fc0135bf037e8a8893f3ab7a0387e054e9b82967598c129577c8fa0ee86ee"

RPROVIDES:${PN} += "MultiMarkdown-6 \
markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-filesystem \
update-alternatives"

inherit rpm
