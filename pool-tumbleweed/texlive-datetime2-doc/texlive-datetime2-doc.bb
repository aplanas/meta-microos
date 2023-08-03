SUMMARY = "Documentation for texlive-datetime2"
DESCRIPTION = "This package includes the documentation for texlive-datetime2"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.7svn63102"

RPM_NAME = "texlive-datetime2-doc-2023.209.1.5.7svn63102-55.1.noarch.rpm"
RPM_HASH = "92961a2c0499c0c8b3fd0fe19d834010b9518a763a8da48cb915ac1a25178c2d8e45c23036a2d8afb7a223f7dffb6304072212dcf2ba993822b5572af270979b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-doc"

RDEPENDS:${PN} += ""

inherit rpm
