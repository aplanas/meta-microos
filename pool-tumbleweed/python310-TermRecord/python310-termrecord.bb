SUMMARY = "A terminal session recorder with HTML output"
DESCRIPTION = "TermRecord is a program that wraps the `script` command. It automagically \
detects the terminal size, records the session, and stores the output as \
either JSON, embeddable JavaScript, or a static HTML file.  The HTML is \
self-contained, embedding all necessary dependencies in one file so that \
it can be shipped to anyone that has a browser. Fonts are embedded, too."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "python310-TermRecord-1.2.5-4.16.noarch.rpm"
RPM_HASH = "892eecaa57f2a31300a6069bb86655539ac8fd93698cd8d51b2d5a350dc1d58a0b6cece6b67f4bda8bec59beef7951f26b5bb594be6d2033e1780f0f6e494021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TermRecord \
python3.10dist-termrecord \
python310-TermRecord \
python3dist-termrecord"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Jinja2 \
update-alternatives"

inherit rpm
