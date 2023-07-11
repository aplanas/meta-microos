SUMMARY = "Documentation for texlive-emarks"
DESCRIPTION = "This package includes the documentation for texlive-emarks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24504"

RPM_NAME = "texlive-emarks-doc-2023.201.1.0svn24504-53.2.noarch.rpm"
RPM_HASH = "44f92bfc7c236d7b941a065bd767b02cc008fbc8c4b0cc586a9a3d697748d044f10ddf0b3896c5224486925f903e8a54f277ec48d0c911fe75e0e37dbe4d6df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emarks-doc"

RDEPENDS:${PN} += ""

inherit rpm
