SUMMARY = "Documentation for texlive-refcheck"
DESCRIPTION = "This package includes the documentation for texlive-refcheck"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-doc-2023.201.1.9.1svn29128-53.2.noarch.rpm"
RPM_HASH = "aa173b3f639a0fef2c8f9e86df9ef24279ba6c0f56a9d9ca59c9bf7d95f3cd5c4e42926aa05bb2de8b3c133c6d99846180161c045e9d818bfefad2038a984981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
