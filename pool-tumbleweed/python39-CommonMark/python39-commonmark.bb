SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-CommonMark-0.9.1-8.2.noarch.rpm"
RPM_HASH = "7ea973a56c380330f1303b730f6c12b6bbeca0891822b61dd45d2f9e3b1d126373eb07f936f69ac0792aec2bfdb90b69e288a003701c2d65fe8bc5ac70ba6ad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3.9dist-commonmark \
python39-CommonMark \
python39-commonmark \
python3dist-commonmark"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
