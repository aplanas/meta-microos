SUMMARY = "Documentation for texlive-jourcl"
DESCRIPTION = "This package includes the documentation for texlive-jourcl"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65290"

RPM_NAME = "texlive-jourcl-doc-2023.201.svn65290-55.1.noarch.rpm"
RPM_HASH = "6139394bf9571d5cbec760e1f0ccf1e7429d2aba9a71d44c0705fa4563ab76d8502c719bd8b8b77fdc4bde5b3262860f4cb10561cfa89ff5db0832b27cf5672a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jourcl-doc"

RDEPENDS:${PN} += ""

inherit rpm
