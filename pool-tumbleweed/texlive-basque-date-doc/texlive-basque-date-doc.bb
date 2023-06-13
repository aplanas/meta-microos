SUMMARY = "Documentation for texlive-basque-date"
DESCRIPTION = "This package includes the documentation for texlive-basque-date"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn26477"

RPM_NAME = "texlive-basque-date-doc-2023.201.1.05svn26477-53.1.noarch.rpm"
RPM_HASH = "ac8ba59bc34abcb1729b9d44c3dbdef59e7f2c611b520602c276121c005d48b90d6ea2b33132aee6656e259212a77f88adb73f65bc5fb4876ba12a5a7d4c3f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-basque-date-doc"

RDEPENDS:${PN} += ""

inherit rpm
