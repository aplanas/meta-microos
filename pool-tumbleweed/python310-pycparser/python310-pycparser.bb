SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "2.21"

RPM_NAME = "python310-pycparser-2.21-2.3.noarch.rpm"
RPM_HASH = "16a1ca6ff4a7b4401c35f6128aac128b7e21df89b955b2aca68f3573501cd7cd946c75248cbe0fa10e03d1ec16c094e0040831913de00d392f9179598589a4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pycparser \
python310-pycparser \
python3dist-pycparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
