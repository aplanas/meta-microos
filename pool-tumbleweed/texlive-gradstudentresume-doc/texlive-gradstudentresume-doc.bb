SUMMARY = "Documentation for texlive-gradstudentresume"
DESCRIPTION = "This package includes the documentation for texlive-gradstudentresume"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38832"

RPM_NAME = "texlive-gradstudentresume-doc-2023.201.svn38832-53.2.noarch.rpm"
RPM_HASH = "bbf453811f9a849add4e6c8ef51c15a3d5c6ffeb99d71409e09fdeeab1652a9d4068978a17d464c1b7fc957c7b552a415eb6764f683ee0d09d637b21811d1ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradstudentresume-doc"

RDEPENDS:${PN} += ""

inherit rpm
