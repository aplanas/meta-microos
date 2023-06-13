SUMMARY = "Documentation for texlive-ndsu-thesis-2022"
DESCRIPTION = "This package includes the documentation for texlive-ndsu-thesis-2022"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63881"

RPM_NAME = "texlive-ndsu-thesis-2022-doc-2023.201.svn63881-54.1.noarch.rpm"
RPM_HASH = "fb444ee94fe21158fae42d348c113ed8680579fee638cd95eb3c3adfe0bc77f6963a4321950ec32330d2f1127c09a1c0ca2ea7c7664c2855d013da63959f8481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ndsu-thesis-2022-doc"

RDEPENDS:${PN} += ""

inherit rpm
