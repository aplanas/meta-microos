SUMMARY = "Documentation for texlive-haranoaji"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji"
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-doc-2023.201.20230223svn66115-53.1.noarch.rpm"
RPM_HASH = "8085851a982f836ea6b7011c6bbe0e8c9d5de8ae0aebf2071da53e6969326614c1109930d438cd34b6c4f9eee0ed7682f2df1d29c2d24bb0daa0533d92dac50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-doc"

RDEPENDS:${PN} += ""

inherit rpm
