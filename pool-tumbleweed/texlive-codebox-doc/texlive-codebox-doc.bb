SUMMARY = "Documentation for texlive-codebox"
DESCRIPTION = "This package includes the documentation for texlive-codebox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn61771"

RPM_NAME = "texlive-codebox-doc-2023.201.1.0.4svn61771-53.1.noarch.rpm"
RPM_HASH = "cccde8ec01ed6e3473cb675f38482bef3119726620d1f45bad2a28b22b945c03e7a2129aa089fb6ba98c05bcd313c4c146537fca34f6eff5dc58f5a624d37e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codebox-doc-zh \
texlive-codebox-doc"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3"

inherit rpm
