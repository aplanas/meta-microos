SUMMARY = "Documentation for texlive-epsincl"
DESCRIPTION = "This package includes the documentation for texlive-epsincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-doc-2023.209.0.0.2svn29349-54.2.noarch.rpm"
RPM_HASH = "f9e1f0b1ccf101fc0cffd7cd9eeecc0e586dcd64d1ceee30f982426377f6ac2bb143072179aba4d4d1a0fb8189c4d470626ca137f40d84add39a6fccfba1bd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
