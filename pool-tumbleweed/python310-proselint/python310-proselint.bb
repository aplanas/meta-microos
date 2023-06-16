SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python310-proselint-0.13.0-2.4.noarch.rpm"
RPM_HASH = "ec869efbb24711d065f3d1a8bd70586db3d3b8abc7f2e6a47c6a8cc2b939f138ddd352b6786371d5b2fa8c08edb00efc06581daa196ea845522b199558976596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proselint \
python3.10dist-proselint \
python310-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-dbm \
python310-future \
update-alternatives"

inherit rpm
