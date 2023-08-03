SUMMARY = "Documentation for texlive-typed-checklist"
DESCRIPTION = "This package includes the documentation for texlive-typed-checklist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn63445"

RPM_NAME = "texlive-typed-checklist-doc-2023.209.2.1svn63445-53.1.noarch.rpm"
RPM_HASH = "293162ea54c50513b3530d9883be0cf6fa0194da36027c17cd3f81b89732b8884b8624e6a34e9b2ed0c1c58ead023961595c75d70dd952864e8f0084bfd310a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typed-checklist-doc"

RDEPENDS:${PN} += ""

inherit rpm
