SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python310-TermRecord-1.2.5-4.18.noarch.rpm"
RPM_HASH = "d3d726f747907406473248c8baa0a03b115e6ed864c0ddcbd5b668da2d863b505ee5f8da7cc3603eac0cfe3a93bd4b590e6bd0524b8217430a5587038c66ef61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-termrecord \
python310-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
update-alternatives"

inherit rpm
