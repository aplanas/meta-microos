SUMMARY = "Documentation for texlive-texdimens"
DESCRIPTION = "This package includes the documentation for texlive-texdimens"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn61070"

RPM_NAME = "texlive-texdimens-doc-2023.201.1.1svn61070-54.1.noarch.rpm"
RPM_HASH = "620a15cb4fa131583b4f063b4356d6db7e7c64573f93b6f72acf1ef18c9053fed060941dba9e8126bd21904f6a2b307625be1f63bb284e35fd68e16934260b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdimens-doc"
RDEPENDS:${PN} += ""

inherit rpm
