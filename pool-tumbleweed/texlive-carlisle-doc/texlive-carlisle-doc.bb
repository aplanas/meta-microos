SUMMARY = "Documentation for texlive-carlisle"
DESCRIPTION = "This package includes the documentation for texlive-carlisle"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59577"

RPM_NAME = "texlive-carlisle-doc-2023.201.svn59577-52.1.noarch.rpm"
RPM_HASH = "4242b3cc4919d3aeb9e97152772aa3e2a5a66c8d8f2f8ebf77fc42dfe274c4367abc33686d1f0b8a6928ecb26e039590344f9eb1cb78e76d225c273e4248f7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carlisle-doc"

RDEPENDS:${PN} += ""

inherit rpm
