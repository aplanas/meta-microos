SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.4.6"

RPM_NAME = "python39-markdown2-2.4.6-1.6.noarch.rpm"
RPM_HASH = "b5836c59da73c3da63d724c75379fd7dce23e817e505a2ab14e746ccfe51c1260b522325c8d118c2cd4f0c467f18a874c6a7e76d2dbbcd39db0700b46640d2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markdown2 \
python39-markdown2 \
python3dist-markdown2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
