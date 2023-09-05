SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python39-proselint-0.13.0-3.1.noarch.rpm"
RPM_HASH = "ea5e338140d2d7ee3bfaa91e4ca228c2586ba068409f53ae9dde91756d116437d08ee812080a202880e6a99755beac6f710649fc8fa252effd94a30ee24e6285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proselint \
python39-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-dbm \
update-alternatives"

inherit rpm
