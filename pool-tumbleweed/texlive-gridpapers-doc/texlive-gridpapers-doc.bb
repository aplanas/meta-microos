SUMMARY = "Documentation for texlive-gridpapers"
DESCRIPTION = "This package includes the documentation for texlive-gridpapers"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-doc-2023.209.1.0.2svn58723-54.2.noarch.rpm"
RPM_HASH = "868014fbfb55034ab2f36f9cfdcaaa05b5a3472937ff8bd7d4b646150f4bc498942944310656c9f93d41bad0eaa623c23ac008ad0a7317454cda9f35e987b63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
