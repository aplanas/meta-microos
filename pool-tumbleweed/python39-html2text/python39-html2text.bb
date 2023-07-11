SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2020.1.16"

RPM_NAME = "python39-html2text-2020.1.16-4.1.noarch.rpm"
RPM_HASH = "4a0d689ee8dcc080715cad891099119be79a24f85cd9bcc85ce5bb39a1d71c7fe3e66c1ebe6568f10ea5eeec54410cfff939429ddc0572b3c0e1228813423489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3.9dist-html2text \
python39-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
