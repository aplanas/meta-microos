SUMMARY = "Documentation for texlive-pdf-trans"
DESCRIPTION = "This package includes the documentation for texlive-pdf-trans"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.4svn32809"

RPM_NAME = "texlive-pdf-trans-doc-2023.209.2.4svn32809-52.1.noarch.rpm"
RPM_HASH = "0063905abfab1030a4c724366a5cf497341b326bd104413b59b0b2149a20a643c63392176737324529e5bb83403354b3a7777e2639bb5147c464312993374921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdf-trans-doc"

RDEPENDS:${PN} += ""

inherit rpm
