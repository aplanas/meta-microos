SUMMARY = "Python Command Line Interface Tools"
DESCRIPTION = "Clint is a module filled with a set of tools for developing \
commandline applications. It supports colors, and custom email-style \
quotes. It has a nestable indentation context manager, and a column \
printer with optional auto-expanding columns with autodetection of \
console size, wrapping your words properly to fit the column size."
LICENSE = "ISC"

PV = "0.5.1"

RPM_NAME = "python39-clint-0.5.1-5.3.noarch.rpm"
RPM_HASH = "b29d5006ae33db7b60181d8d3f5fc18cf1d937c738033a9efc8abfabb0761e70b4f07170b3a25f70333d37b08dcdd14c5670b9e6da5a84d13090a124076e5d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(clint) \
python39-clint \
python3dist(clint)"

RDEPENDS:${PN} += "python(abi) \
python39-args"

inherit rpm
