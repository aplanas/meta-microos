SUMMARY = "Documentation for texlive-l3kernel"
DESCRIPTION = "This package includes the documentation for texlive-l3kernel"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66094"

RPM_NAME = "texlive-l3kernel-doc-2023.201.svn66094-55.1.noarch.rpm"
RPM_HASH = "37a5fa4b4baac3f38287a72868eb52481f25544a57cfaea4598c167b4b6deafe9152037a0686fb1db532306da919cd19330b70a7c01268d302a320cc1e773eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3kernel-doc"
RDEPENDS:${PN} += ""

inherit rpm
