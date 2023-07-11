SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "2.21"

RPM_NAME = "python39-pycparser-2.21-2.3.noarch.rpm"
RPM_HASH = "c25f759d1c7e8966ee5cb23726aedd27fa2fe17cd3098c38585e55774e253bf53f5b14962cbac57f569aa8a2490c5a8c6731a46a5724159a7f966f51d104f250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycparser \
python39-pycparser \
python3dist-pycparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
