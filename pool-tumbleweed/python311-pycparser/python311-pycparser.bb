SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "2.21"

RPM_NAME = "python311-pycparser-2.21-2.3.noarch.rpm"
RPM_HASH = "112554fe5e2ef7fa4fec07d2524ff4438fdd431f4d68e2fbd7e9d66a12ebd2c8e40c922bec60b178b7cc1fc28f03368e408782113830fa396e37838e8ccd3bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycparser \
python3.11dist-pycparser \
python311-pycparser \
python3dist-pycparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
