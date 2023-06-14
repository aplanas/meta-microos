SUMMARY = "Documentation for texlive-shipunov"
DESCRIPTION = "This package includes the documentation for texlive-shipunov"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52334"

RPM_NAME = "texlive-shipunov-doc-2023.201.1.2svn52334-53.1.noarch.rpm"
RPM_HASH = "6d77726f428be712db83bc7433272e1c9d814af9ad74960f2aefbfc30383a0bf74b0e4d81dc9fff2da985ae85a0301580ca3e1e76fb9a9a3f4da0f59800f8856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shipunov-doc-en \
texlive-shipunov-doc"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl"

inherit rpm
