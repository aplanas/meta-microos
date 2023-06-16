SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.4.6"

RPM_NAME = "python39-markdown2-2.4.6-1.4.noarch.rpm"
RPM_HASH = "e5f9b404c46848664d9191b90e51bbc321d1fbc3c139d3e4cccb065dca588886dfeab39e5ec61eddef1e4176832a081d1ab010d8dc3f76994d2e048cda487fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markdown2 \
python39-markdown2 \
python3dist-markdown2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
