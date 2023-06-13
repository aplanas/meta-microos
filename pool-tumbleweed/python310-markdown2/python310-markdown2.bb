SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.4.6"

RPM_NAME = "python310-markdown2-2.4.6-1.4.noarch.rpm"
RPM_HASH = "3ec92db31cf3f4719e7b57b5b09f5bfd20e52255ce074c6c0d0fa2d410d6ac11074a520efe9b463e1a2c77a86e6417cde0a0921eb59a0a32fb53bfb4ea9a36b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown2 \
python3.10dist(markdown2) \
python310-markdown2 \
python3dist(markdown2)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
