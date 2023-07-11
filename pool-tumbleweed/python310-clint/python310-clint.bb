SUMMARY = "Python Command Line Interface Tools"
DESCRIPTION = "Clint is a module filled with a set of tools for developing \
commandline applications. It supports colors, and custom email-style \
quotes. It has a nestable indentation context manager, and a column \
printer with optional auto-expanding columns with autodetection of \
console size, wrapping your words properly to fit the column size."
LICENSE = "ISC"

PV = "0.5.1"

RPM_NAME = "python310-clint-0.5.1-5.5.noarch.rpm"
RPM_HASH = "4f445ed3fce6f430d4fa7296804b0bf9f6b40a43cbd6970eef26bbc4d6ec6f20dd811735a221f1e974ffba477207ca00d0c7f8e2abf8346e7b6746528bfc2b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-clint \
python310-clint \
python3dist-clint"

RDEPENDS:${PN} += "python-abi \
python310-args"

inherit rpm
