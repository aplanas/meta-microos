SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python311-TermRecord-1.2.5-4.16.noarch.rpm"
RPM_HASH = "596987154a4cb3c45984a95bc9bf2f0b4b71e394d457d82e2acc10b18f2e4ca0beefe864aec6e846babf1af4f9bb1c2ada00e99bfa049400191166634fc7aed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-termrecord \
python311-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Jinja2 \
update-alternatives"

inherit rpm
