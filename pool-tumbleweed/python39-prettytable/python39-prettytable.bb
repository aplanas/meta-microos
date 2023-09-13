SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.8.0"

RPM_NAME = "python39-prettytable-3.8.0-1.1.noarch.rpm"
RPM_HASH = "7dfdaf76bf8e73ccb6a2cf28029d39b018b49f8bee39b595fbc634391a3da2da78196de9a4ee8d71f80934c66bfaa62da9d0359e65e46ef1e74443a4c4b77f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-prettytable \
python39-PrettyTable \
python39-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python39-wcwidth"

inherit rpm
