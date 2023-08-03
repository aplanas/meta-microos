SUMMARY = "Documentation for texlive-animate"
DESCRIPTION = "This package includes the documentation for texlive-animate"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64401"

RPM_NAME = "texlive-animate-doc-2023.209.svn64401-55.1.noarch.rpm"
RPM_HASH = "5a962e066d58111da9618c1a28aaf797194016a94904ca7000513e78653567a5a77f38825155d4c2dbe17380f12dd7acb2db73ac04895ce11ed66695a494e78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-animate-doc"

RDEPENDS:${PN} += ""

inherit rpm
