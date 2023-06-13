SUMMARY = "Documentation for texlive-authoraftertitle"
DESCRIPTION = "This package includes the documentation for texlive-authoraftertitle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55889"

RPM_NAME = "texlive-authoraftertitle-doc-2023.201.1.0svn55889-53.1.noarch.rpm"
RPM_HASH = "80271444988f49ae8edcbd39f25bdbb91c25580be81dcaa8b6862fd66accdc36bb64bab2cb4fd620123fe96729b955e625dd3a49c10bbcfc4f1c1609b708c094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authoraftertitle-doc"

RDEPENDS:${PN} += ""

inherit rpm
