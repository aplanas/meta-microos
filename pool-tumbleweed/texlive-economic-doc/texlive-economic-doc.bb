SUMMARY = "Documentation for texlive-economic"
DESCRIPTION = "This package includes the documentation for texlive-economic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32639"

RPM_NAME = "texlive-economic-doc-2023.209.svn32639-54.2.noarch.rpm"
RPM_HASH = "5c207cb8cc126831867ba1713f0b326324797caeb8a1578ff93acf4e0d1dfb38f9dde790296722acfb34d720a897fe3a66f6e0191562593a09ad9042fafc57eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-economic-doc"

RDEPENDS:${PN} += ""

inherit rpm
