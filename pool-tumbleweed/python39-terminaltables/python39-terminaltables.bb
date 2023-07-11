SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-terminaltables-3.1.0-2.16.noarch.rpm"
RPM_HASH = "7a4785da5917b6e257e8ae12a3fa09a25b00b40c5a79387db1e1ade63c1b84f5c1153cc7bb6c22c9737b00ca0a658484c9efda0e57b27842ecd081deceb13b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-terminaltables \
python39-terminaltables \
python3dist-terminaltables"

RDEPENDS:${PN} += "python-abi \
python39-colorama \
python39-colorclass \
python39-termcolor"

inherit rpm
