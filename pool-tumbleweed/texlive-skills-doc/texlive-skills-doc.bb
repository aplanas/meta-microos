SUMMARY = "Documentation for texlive-skills"
DESCRIPTION = "This package includes the documentation for texlive-skills"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn56734"

RPM_NAME = "texlive-skills-doc-2023.201.1.0.0svn56734-57.1.noarch.rpm"
RPM_HASH = "281307bf829dbddb7d11ace3c96954f8316e2145a00732a92b228fec5d8f1cd82ac858043221da6c3f6651adca7c0dd42c309e3ec826f2e35fdf5bb2797ff94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skills-doc"

RDEPENDS:${PN} += ""

inherit rpm
