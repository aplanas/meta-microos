SUMMARY = "Documentation for GLab"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "glab-doc-1.32.0-1.1.noarch.rpm"
RPM_HASH = "13ac8e44d04d54952dad21732d0cb428157844b02e196dbbfe6959af66f2994892e8065747c0d4807882792536b993c0e1b9f5b56365b8a12926940351accdff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-doc"

RDEPENDS:${PN} += ""

inherit rpm
