SUMMARY = "Documentation for texlive-rescansync"
DESCRIPTION = "This package includes the documentation for texlive-rescansync"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-doc-2023.201.0.0.0.0svn63856-53.2.noarch.rpm"
RPM_HASH = "b3acfac994df516a924a94ad50149a77158487ea3815a0504ea80864f891b9702dac62175dda940ca81ad1cb2b5506c26a6ac5a9912c4dbe8f49ac86a19ea827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rescansync-doc"

RDEPENDS:${PN} += ""

inherit rpm
