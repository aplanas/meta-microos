SUMMARY = "Documentation for texlive-xindex"
DESCRIPTION = "This package includes the documentation for texlive-xindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.47svn65597"

RPM_NAME = "texlive-xindex-doc-2023.201.0.0.47svn65597-52.2.noarch.rpm"
RPM_HASH = "8c00f0cd12fa8bfc371284806f8160ec3c26665c9a9a08e1bf4cf42fd8c257388d4bf6848afca9f6da92df79a9633ce222ba0b49d9500583a692c844597fe5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xindex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
