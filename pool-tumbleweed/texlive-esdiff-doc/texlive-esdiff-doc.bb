SUMMARY = "Documentation for texlive-esdiff"
DESCRIPTION = "This package includes the documentation for texlive-esdiff"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21385"

RPM_NAME = "texlive-esdiff-doc-2023.201.1.2svn21385-53.1.noarch.rpm"
RPM_HASH = "ed9094d335d8dc63b003d12a22b69c89b130c206b39700f1049f71e9349f24a881f16b8da64d62186952a17f33be9e520c299b7fdcd4ff187b1cd7ce71d31163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esdiff-doc"
RDEPENDS:${PN} += ""

inherit rpm
