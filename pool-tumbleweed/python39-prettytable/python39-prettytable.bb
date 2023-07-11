SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python39-prettytable-3.7.0-1.3.noarch.rpm"
RPM_HASH = "6f80325f1ba4632db634fc38e083b254dd61dbf0c872ab02a7287142906c93b6c0805d8333731eb6aefe7b4124610b6b92bc55271c677bcab9e8b498f7d997b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-prettytable \
python39-PrettyTable \
python39-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python39-wcwidth"

inherit rpm
