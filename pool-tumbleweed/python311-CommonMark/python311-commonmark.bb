SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python311-CommonMark-0.9.1-8.2.noarch.rpm"
RPM_HASH = "c6ddcc124424e4e93948e958802ebab1ad5ecc7501f3020e216d00e61c6027a77d480e826ced3ec023483bc71e1b3c0be2e4145d4773456b277973932160a3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3-CommonMark \
python3-commonmark \
python3.11dist-commonmark \
python311-CommonMark \
python311-commonmark \
python3dist-commonmark"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
