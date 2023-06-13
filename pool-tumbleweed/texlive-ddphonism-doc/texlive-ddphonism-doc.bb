SUMMARY = "Documentation for texlive-ddphonism"
DESCRIPTION = "This package includes the documentation for texlive-ddphonism"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn52009"

RPM_NAME = "texlive-ddphonism-doc-2023.201.0.0.2svn52009-52.1.noarch.rpm"
RPM_HASH = "6b44c20070207a6492c7dba805f16c45e482f8d42c3afa105f13e0d0f76db5ab735ebe045bfa8db5297fcb82f2666e864cdbc155ff497d4175bc0307ef459e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ddphonism-doc"

RDEPENDS:${PN} += ""

inherit rpm
