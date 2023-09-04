SUMMARY = "Convert Markdown syntax to (X)HTML"
DESCRIPTION = "Markdown is a text-to-HTML filter; it translates an easy-to-read / \
easy-to-write structured text format into HTML. Markdown's text format is \
most similar to that of plain text email, and supports features such as \
headers, *emphasis*, code blocks, blockquotes, and links. \
 \
Markdown's syntax is designed not as a generic markup language, but \
specifically to serve as a front-end to (X)HTML. You can use span-level \
HTML tags anywhere in a Markdown document, and you can use block level HTML \
tags (like <div> and <table> as well)."
LICENSE = "BSD-3-Clause"

PV = "1.000031"

RPM_NAME = "perl-Text-Markdown-1.000031-17.4.noarch.rpm"
RPM_HASH = "3352e44882c7a6571b3d36f0693c2e7f3926b32d0b03182b286c177d9e5e0b652cf088b09163e8ade9e382aa846765a616546edcafa1fe7ec59c09b5cd3fdce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Markdown \
perl-Text-Markdown"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
perl--MODULE-COMPAT-5.38.0 \
update-alternatives"

inherit rpm
