SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python39-proselint-0.13.0-2.6.noarch.rpm"
RPM_HASH = "ae3fa33b6309504dc84f8cde1fc2bb4342001178c057cda16da73f63865ddb36b33b9e4dc39cbe0b28256f906b3ca86c3057fca18b99531d62098d9b00d21d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proselint \
python39-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-dbm \
python39-future \
update-alternatives"

inherit rpm
