SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-doc-5.0-1.14.noarch.rpm"
RPM_HASH = "b44c14935315a6912d46fd2880e41b4f21c852905b1dd614b160ab01e3b81b4eae0f52729b88083fbac68a95fec696facc2a0d1ef06e2224abfec5f2a31d230c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glpk-doc"

RDEPENDS:${PN} += ""

inherit rpm
