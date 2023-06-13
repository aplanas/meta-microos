SUMMARY = "Documentation for texlive-datetime2-czech"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-czech"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47033"

RPM_NAME = "texlive-datetime2-czech-doc-2023.201.1.1svn47033-52.1.noarch.rpm"
RPM_HASH = "266a0c352600ddbd9b9102c5abd78f8b5bc3b9609592638978cd4c3050700459192a7eb00167566aebc388b5df9580320fca69d4d5753c7ae3e6e61f7ea134ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-czech-doc"

RDEPENDS:${PN} += ""

inherit rpm
