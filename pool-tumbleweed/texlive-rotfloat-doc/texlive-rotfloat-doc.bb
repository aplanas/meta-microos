SUMMARY = "Documentation for texlive-rotfloat"
DESCRIPTION = "This package includes the documentation for texlive-rotfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18292"

RPM_NAME = "texlive-rotfloat-doc-2023.209.1.2svn18292-54.1.noarch.rpm"
RPM_HASH = "c3ea1e634c33c862ab0c5cc04720dbe5f320425ab5c6ccc0ba0bc945f1c46ec480484891a75006e343bf99b16099827ecea58a74c5fc6949908cd5584bda5205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rotfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
