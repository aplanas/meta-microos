SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python39-TermRecord-1.2.5-4.18.noarch.rpm"
RPM_HASH = "3e9d3096aabd446ad1cf5d7e12f3fd8d354e1025ddf54dac245fcb3422c5f328a7fcb90300806624d31c4ed3de84d2433778be0db06cda451b193d9886cb79d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-termrecord \
python39-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
update-alternatives"

inherit rpm
