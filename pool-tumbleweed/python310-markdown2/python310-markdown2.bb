SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.4.6"

RPM_NAME = "python310-markdown2-2.4.6-1.6.noarch.rpm"
RPM_HASH = "29bdd2b1dcd2cbaca76b9d433656a441d7c39d7a79d89e2ffd622287b56374bde5872664dbc09e2dc4246cd55462e0a5a88ed63f8cbf15613ea64ffcb4a81af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-markdown2 \
python310-markdown2 \
python3dist-markdown2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
