SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "2.21"

RPM_NAME = "python310-pycparser-2.21-2.1.noarch.rpm"
RPM_HASH = "e349794ac154725b35f0c9edfc40a2043d9ce86614f5f8194cd2a1582103736dfbf2d56c300af0ab8907590c80d3f92cd01ec2976fbe7c8c2fb9c62201356105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycparser \
python3.10dist(pycparser) \
python310-pycparser \
python3dist(pycparser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
