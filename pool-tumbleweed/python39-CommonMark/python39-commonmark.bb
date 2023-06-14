SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-CommonMark-0.9.1-8.1.noarch.rpm"
RPM_HASH = "7d4735c2e0f5e901fdbaf09488d6635a6d1f5d03df28e09f52077fa11b22ca28a807e5741ca3e8982cedfffdbee456ff6093d5f6deb11e2216ff3e9aa31fdd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3.9dist-commonmark \
python39-CommonMark \
python39-commonmark \
python3dist-commonmark"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
