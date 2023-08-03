SUMMARY = "Documentation for texlive-xcharter-math"
DESCRIPTION = "This package includes the documentation for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-doc-2023.209.0.0.36svn65686-53.1.noarch.rpm"
RPM_HASH = "d914330702a7b4edf2f407adf6a8909a55bb185e9f5a5958a80617aed22fcbcee259fc42e7933a6c252cca6ead6922d603f0ba44c196fd3eb8f53e8a75d53524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
