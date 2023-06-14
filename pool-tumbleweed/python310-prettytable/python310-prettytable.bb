SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python310-prettytable-3.7.0-1.1.noarch.rpm"
RPM_HASH = "365e2226df58397a41294f127ba1c51581f0570d1d1110b16ce4722cd0b87122d91831246dfafd9a5b97a612872dee4791b1d5146cf584f9eaf40eb0ad7d6602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PrettyTable \
python3-prettytable \
python3.10dist-prettytable \
python310-PrettyTable \
python310-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python310-wcwidth"

inherit rpm
