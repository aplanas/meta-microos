SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python311-TermRecord-1.2.5-4.18.noarch.rpm"
RPM_HASH = "b6d4a1a0a50b25fbae6fc141fc55f5cb7dc4a82ad73f9b1cd1d576aa82f0d9027546aad4e6fa385129d6e88947ec0f022a8989a6fb412b8d2bf7c744c50f49b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TermRecord \
python3.11dist-termrecord \
python311-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
update-alternatives"

inherit rpm
