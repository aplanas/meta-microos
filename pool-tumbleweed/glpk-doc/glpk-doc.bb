SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-doc-5.0-1.13.noarch.rpm"
RPM_HASH = "006f159fdcd2b900aa5f93f6053f2351ac34707c3fc71e63fe14abc166ae9becbd1dc047337ad501e3e08b1c2ba293de3a001ba47bc1a5a21832885dfbf013e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glpk-doc"

RDEPENDS:${PN} += ""

inherit rpm
