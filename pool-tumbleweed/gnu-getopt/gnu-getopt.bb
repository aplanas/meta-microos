SUMMARY = "Java getopt Implementation"
DESCRIPTION = "The GNU Java getopt classes support short and long argument parsing in \
a manner 100% compatible with the version of GNU getopt in glibc 2.0.6 \
with a mostly compatible programmer's interface as well. Note that this \
is a port, not a new implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.14"

RPM_NAME = "gnu-getopt-1.0.14-1.14.noarch.rpm"
RPM_HASH = "69500d6578c75f1e0a32a435f9b47eb681cefec081ed450f097293198f2d7e7086e2bec962bf39e9d718f47eba2f226cc0a9dce516662d352509515699416115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-getopt"

RDEPENDS:${PN} += ""

inherit rpm
