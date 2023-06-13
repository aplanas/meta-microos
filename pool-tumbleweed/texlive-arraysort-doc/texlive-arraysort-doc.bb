SUMMARY = "Documentation for texlive-arraysort"
DESCRIPTION = "This package includes the documentation for texlive-arraysort"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn31576"

RPM_NAME = "texlive-arraysort-doc-2023.201.1.0svn31576-53.1.noarch.rpm"
RPM_HASH = "e7d8b03083a9bf6f9a08354d61edf7b8ef6d257d982c483865d90ff7ea285ae61fc026de75cc6d9ea04b2f3db45989bc65d09040948834c378e98bff7e96e2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arraysort-doc"

RDEPENDS:${PN} += ""

inherit rpm
