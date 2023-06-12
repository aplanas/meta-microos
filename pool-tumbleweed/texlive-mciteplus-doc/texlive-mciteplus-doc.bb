SUMMARY = "Documentation for texlive-mciteplus"
DESCRIPTION = "This package includes the documentation for texlive-mciteplus"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn31648"

RPM_NAME = "texlive-mciteplus-doc-2023.201.1.2svn31648-52.1.noarch.rpm"
RPM_HASH = "353e21de49a500c97840b166f1c8b3c004ca1e647b01840117b3063d9b3e48b008f4f1f27c2039caa4d7ae5e918aebeb033f43b0fa8e339d959d1c50675523b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mciteplus-doc"
RDEPENDS:${PN} += ""

inherit rpm
