SUMMARY = "Documentation for texlive-simple-resume-cv"
DESCRIPTION = "This package includes the documentation for texlive-simple-resume-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn43057"

RPM_NAME = "texlive-simple-resume-cv-doc-2023.201.svn43057-53.1.noarch.rpm"
RPM_HASH = "f4c25fbf09a67d7ffd8aca678eb9611551b66080901c2e20080c2e615b0d46d046483d1cc0625697302c0fb99734703083db1bfe6c17cc46444c9bbb74bef26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simple-resume-cv-doc"
RDEPENDS:${PN} += ""

inherit rpm
