SUMMARY = "Documentation for texlive-rerunfilecheck"
DESCRIPTION = "This package includes the documentation for texlive-rerunfilecheck"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-doc-2023.201.1.10svn63869-53.2.noarch.rpm"
RPM_HASH = "d1f7efce08ea946be7cac7b3e23bddee5b1ed366d30b82f8e1abb23a3a5b6c467770f22bba7b5a0346873463e0558ee9eefa7f4879df9a0aa421b8e0dc3303d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rerunfilecheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
