SUMMARY = "Documentation for texlive-gsemthesis"
DESCRIPTION = "This package includes the documentation for texlive-gsemthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-doc-2023.209.0.0.9.4svn56291-54.2.noarch.rpm"
RPM_HASH = "481559a396fcc5df0e0a2a35e26604ebcd2fdedc75d0f3a246dc1ddb5b95a8a8460d5075f042678000d909898917a93316e176a7afb7a97f42ae720af9cc165d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsemthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
