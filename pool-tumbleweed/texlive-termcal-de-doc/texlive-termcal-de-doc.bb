SUMMARY = "Documentation for texlive-termcal-de"
DESCRIPTION = "This package includes the documentation for texlive-termcal-de"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn47111"

RPM_NAME = "texlive-termcal-de-doc-2023.209.2.0svn47111-55.1.noarch.rpm"
RPM_HASH = "b2bc1987f3142607bff75dc8ebe069f31e258bc34d9fbfa5df481572153379cb40e2423fb96a8cd15ee6a01f4953a30eb53b41825117ddbd7a7f5570fcd68ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termcal-de-doc"

RDEPENDS:${PN} += ""

inherit rpm
