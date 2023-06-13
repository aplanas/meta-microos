SUMMARY = "Documentation for texlive-inputtrc"
DESCRIPTION = "This package includes the documentation for texlive-inputtrc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-doc-2023.201.0.0.3svn28019-52.1.noarch.rpm"
RPM_HASH = "6617c370ca7d662b3dbf081d53c7ed69d4d982ff29ba292ec9579f7a8a8458c91745c6bfebcf3c7c9f75bd42b7cb3b27c1c69954e093eae9fa8850d846754021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputtrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
