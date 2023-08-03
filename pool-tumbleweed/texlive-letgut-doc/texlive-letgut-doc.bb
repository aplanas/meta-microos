SUMMARY = "Documentation for texlive-letgut"
DESCRIPTION = "This package includes the documentation for texlive-letgut"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.6svn65548"

RPM_NAME = "texlive-letgut-doc-2023.209.0.0.9.6svn65548-55.1.noarch.rpm"
RPM_HASH = "8864c0dd6521eda24c5f0a61a4a95ff053b7dfc881146bda617dfee2aaaa7033686fe6c398f6f997be6aacfe7d43c089ed597851bae79620e2a4ee5759c5f503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-letgut-doc"

RDEPENDS:${PN} += ""

inherit rpm
