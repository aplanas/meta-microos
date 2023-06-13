SUMMARY = "Documentation for texlive-a4wide"
DESCRIPTION = "This package includes the documentation for texlive-a4wide"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20943"

RPM_NAME = "texlive-a4wide-doc-2023.201.svn20943-54.1.noarch.rpm"
RPM_HASH = "a0dada227ca5c1fb44de641475db6841c224cbb3840a0316a711836548e1ced37381b984b4beee405df022a9d436e68fab70411fedaebaaa72ea5dacadc0fcbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a4wide-doc"

RDEPENDS:${PN} += ""

inherit rpm
