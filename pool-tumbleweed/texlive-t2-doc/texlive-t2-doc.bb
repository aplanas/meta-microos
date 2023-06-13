SUMMARY = "Documentation for texlive-t2"
DESCRIPTION = "This package includes the documentation for texlive-t2"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn47870"

RPM_NAME = "texlive-t2-doc-2023.201.svn47870-57.1.noarch.rpm"
RPM_HASH = "7d2fddf50fe279a8c7b1cd83830af1f72011a32f1b39059cb9bb4c53dcace51824b1585a9ba11980af59839c59862bcf132eb6a803d9723ecad2332a69078846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-t2-doc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl"

inherit rpm
