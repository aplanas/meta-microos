SUMMARY = "Documentation for texlive-euro"
DESCRIPTION = "This package includes the documentation for texlive-euro"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn22191"

RPM_NAME = "texlive-euro-doc-2023.209.1.1svn22191-53.1.noarch.rpm"
RPM_HASH = "8c21842e02d1bedb675004de0bee9852ce853c6550d4c1e311aed4a5554602ffae80f0ce9adb026a69ff8c7df45074db574497bed9d1bb0b530378fe200e529b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euro-doc"

RDEPENDS:${PN} += ""

inherit rpm
