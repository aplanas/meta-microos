SUMMARY = "Documentation for texlive-erewhon"
DESCRIPTION = "This package includes the documentation for texlive-erewhon"
LICENSE = "OFL-1.1"

PV = "2023.201.1.12svn63312"

RPM_NAME = "texlive-erewhon-doc-2023.201.1.12svn63312-53.2.noarch.rpm"
RPM_HASH = "a0b8e02f8b62d42641eacf0e1ab70cb2829e064240eb71e174e9f3e2da367868ed11ca6e2d31de051a4fa7c46478c8f1803e6c762268dc338d58ccc04bf8b14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-doc"

RDEPENDS:${PN} += ""

inherit rpm
