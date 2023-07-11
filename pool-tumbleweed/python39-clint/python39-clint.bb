SUMMARY = "Python Command Line Interface Tools"
DESCRIPTION = "Clint is a module filled with a set of tools for developing \
commandline applications. It supports colors, and custom email-style \
quotes. It has a nestable indentation context manager, and a column \
printer with optional auto-expanding columns with autodetection of \
console size, wrapping your words properly to fit the column size."
LICENSE = "ISC"

PV = "0.5.1"

RPM_NAME = "python39-clint-0.5.1-5.5.noarch.rpm"
RPM_HASH = "3c95a2c40ee20ff807ac1fde7e13f29e03cbf46cdfe2d6335acefca781a3c7f30ab30874f9193af832ab12f18191e6d38a7e824eab5b234247ace16c322d2eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-clint \
python39-clint \
python3dist-clint"

RDEPENDS:${PN} += "python-abi \
python39-args"

inherit rpm
