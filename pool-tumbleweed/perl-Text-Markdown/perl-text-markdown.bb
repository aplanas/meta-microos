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

RPM_NAME = "perl-Text-Markdown-1.000031-17.3.noarch.rpm"
RPM_HASH = "6ebca8f2640824a42a68163afce5ec31dd714cc9e19bafc7079db25a2a9409352ea1510ff3d90ff061e2fe93b9fdb11e4b223e2f49101a45417e861bfa01baaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Markdown \
perl-Text-Markdown"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
perl--MODULE-COMPAT-5.36.1 \
update-alternatives"

inherit rpm
