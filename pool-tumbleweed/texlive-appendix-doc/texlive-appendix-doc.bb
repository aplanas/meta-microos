SUMMARY = "Documentation for texlive-appendix"
DESCRIPTION = "This package includes the documentation for texlive-appendix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn53718"

RPM_NAME = "texlive-appendix-doc-2023.209.1.2csvn53718-55.1.noarch.rpm"
RPM_HASH = "0ab17cabfc919f414d1143366ec544fb1795f1aad63c56e3bf65e64caae7d6d7104adc171bd582d01dbed3b1c442028f8185f7c42b9f09fe15503cfe6b7eb57a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-appendix-doc"

RDEPENDS:${PN} += ""

inherit rpm
