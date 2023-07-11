SUMMARY = "Python Command Line Interface Tools"
DESCRIPTION = "Clint is a module filled with a set of tools for developing \
commandline applications. It supports colors, and custom email-style \
quotes. It has a nestable indentation context manager, and a column \
printer with optional auto-expanding columns with autodetection of \
console size, wrapping your words properly to fit the column size."
LICENSE = "ISC"

PV = "0.5.1"

RPM_NAME = "python311-clint-0.5.1-5.5.noarch.rpm"
RPM_HASH = "6046504a20763a83ab95acc4e8451110ce74eabbdfdd7e45ca173fd5c6eacfb441590386ffeb065fe5f95baaf7c32eec2d899b931c043e7239f6e37361153c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clint \
python3.11dist-clint \
python311-clint \
python3dist-clint"

RDEPENDS:${PN} += "python-abi \
python311-args"

inherit rpm
