SUMMARY = "Documentation for texlive-apalike-ejor"
DESCRIPTION = "This package includes the documentation for texlive-apalike-ejor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn59667"

RPM_NAME = "texlive-apalike-ejor-doc-2023.209.1.2.0svn59667-55.1.noarch.rpm"
RPM_HASH = "759b06bb07df6f25a17a5ba836992eada99c7d2c7e27563b8fc465fcf093c5f585f025d719dd75d62b2f62014255922e06f151aa9deaebc0a9aa6e9e51a78238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-ejor-doc"

RDEPENDS:${PN} += ""

inherit rpm
