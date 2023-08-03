SUMMARY = "Documentation for texlive-tikzpackets"
DESCRIPTION = "This package includes the documentation for texlive-tikzpackets"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55827"

RPM_NAME = "texlive-tikzpackets-doc-2023.209.1.0svn55827-53.1.noarch.rpm"
RPM_HASH = "4a771556156a6ad801c6e848a917af8619c298fe7e600c00d94f3fb378058974dec7ab50d4765df44f221745021ae2154b563ca8bd2564b9ebf417d2c7a286ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
