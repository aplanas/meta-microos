SUMMARY = "Documentation for texlive-fmtcount"
DESCRIPTION = "This package includes the documentation for texlive-fmtcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.07svn53912"

RPM_NAME = "texlive-fmtcount-doc-2023.201.3.07svn53912-52.1.noarch.rpm"
RPM_HASH = "3ef9c74e0a26c99c8385de3acee24dba5acdf08996d515a7d8c64c98c5640f7952dea8a3ae06370dc63cba41c4fac9027f82de6081d6ce49e1c0dc629ebc783a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fmtcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
