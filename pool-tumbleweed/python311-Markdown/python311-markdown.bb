SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python311-Markdown-3.4.4-1.1.noarch.rpm"
RPM_HASH = "613bd16573b7220ab97095b940dec31491d698b4c9b044abd8f344c3f6dedaee4c57d95ebb920f5fb4f928a77f030537042cf56784b98ddd0555292fbffc4691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markdown \
python3.11dist-markdown \
python311-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
