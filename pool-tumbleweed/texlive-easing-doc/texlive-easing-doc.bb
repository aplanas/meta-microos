SUMMARY = "Documentation for texlive-easing"
DESCRIPTION = "This package includes the documentation for texlive-easing"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn59975"

RPM_NAME = "texlive-easing-doc-2023.209.0.0.1svn59975-54.1.noarch.rpm"
RPM_HASH = "da3ba4c5e11416ef99e09be589b836d6a3b29ae731ce3c3f26ecd5bb91114648a1179701315a17291b014b6bc1b8f2e8f44a4901e32b4b017b539b1b40aecc43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easing-doc"

RDEPENDS:${PN} += ""

inherit rpm
