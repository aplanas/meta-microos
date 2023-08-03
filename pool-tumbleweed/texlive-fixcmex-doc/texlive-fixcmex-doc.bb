SUMMARY = "Documentation for texlive-fixcmex"
DESCRIPTION = "This package includes the documentation for texlive-fixcmex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51825"

RPM_NAME = "texlive-fixcmex-doc-2023.209.1.1svn51825-53.1.noarch.rpm"
RPM_HASH = "3145e05e5accafffcb0a3f77206365f78001a69c6238920d06253407cd82947d240478dd4eae09c541f1bffd6cc0bbb81e4e488770ce835f40eaed00c22d7b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixcmex-doc"

RDEPENDS:${PN} += ""

inherit rpm
