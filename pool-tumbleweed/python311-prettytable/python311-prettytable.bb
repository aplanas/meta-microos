SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.8.0"

RPM_NAME = "python311-prettytable-3.8.0-1.1.noarch.rpm"
RPM_HASH = "cf24ed6d597c3c3fad9da97abc43aed32f37f5bbff78065762ee92312ebf6dd73ab821477691b20d59aa439840cc895fe27ff151de1c2db8349794e7ebec96b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PrettyTable \
python3-prettytable \
python3.11dist-prettytable \
python311-PrettyTable \
python311-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python311-wcwidth"

inherit rpm
