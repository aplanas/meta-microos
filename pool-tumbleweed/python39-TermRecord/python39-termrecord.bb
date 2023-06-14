SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python39-TermRecord-1.2.5-4.16.noarch.rpm"
RPM_HASH = "a8ecc4fa53eafbff75a2bfb8aa527fbef3c1eb3bfe1f7002cb498f6811b4bbf781996534530cd8ca24cf7ea882f8d664885b1511aae590c002501ae9a93b5365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-termrecord \
python39-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Jinja2 \
update-alternatives"

inherit rpm
