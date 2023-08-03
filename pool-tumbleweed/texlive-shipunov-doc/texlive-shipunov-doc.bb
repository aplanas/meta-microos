SUMMARY = "Documentation for texlive-shipunov"
DESCRIPTION = "This package includes the documentation for texlive-shipunov"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52334"

RPM_NAME = "texlive-shipunov-doc-2023.209.1.2svn52334-54.1.noarch.rpm"
RPM_HASH = "f71524ee5f66fffa3d93ea80507f1ad3363f8858336f544f73b8342dc233d95201fdb0bc0675aaab9e9ce8cbcd1c2db77c92fa8798f17f9935887fbe1ddd51c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shipunov-doc-en \
texlive-shipunov-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl"

inherit rpm
