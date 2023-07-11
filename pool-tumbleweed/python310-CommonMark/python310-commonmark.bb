SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python310-CommonMark-0.9.1-8.2.noarch.rpm"
RPM_HASH = "257d55f574414816f34ce9be452b84da4c87b6858a2d07fa7ea8e26402ae0c19402e8d44019f980dc42fd6bfca3094becaf0e108eb19b3902bc3f4b88d616a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3.10dist-commonmark \
python310-CommonMark \
python310-commonmark \
python3dist-commonmark"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
