SUMMARY = "Documentation for texlive-csassignments"
DESCRIPTION = "This package includes the documentation for texlive-csassignments"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn63992"

RPM_NAME = "texlive-csassignments-doc-2023.209.1.0.2svn63992-55.1.noarch.rpm"
RPM_HASH = "a6fdddf5a6abf8400f4929a8aeb091d75c2f96a6ad2c5fcd3cc6c719d355ec143111bcb7f053ad0bb17edefda26e22760c158bcdd949895b68c6c4d188c351b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csassignments-doc"

RDEPENDS:${PN} += ""

inherit rpm
