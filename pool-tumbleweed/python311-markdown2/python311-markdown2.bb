SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.4.6"

RPM_NAME = "python311-markdown2-2.4.6-1.6.noarch.rpm"
RPM_HASH = "3921538712a766a2761ec44cb0793102b2e04adf0a351d6e9afa5335e0bc8572af7b6eaaf83f4e1c761ce58d5f790a5f2a1af45ac416177b4171e932a5eb46f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown2 \
python3.11dist-markdown2 \
python311-markdown2 \
python3dist-markdown2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
