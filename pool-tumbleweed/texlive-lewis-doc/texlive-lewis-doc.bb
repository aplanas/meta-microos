SUMMARY = "Documentation for texlive-lewis"
DESCRIPTION = "This package includes the documentation for texlive-lewis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-lewis-doc-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "d5d86252b12e2f114daea03d82b7ebeec44bc038147ec6ed936792ed43940ad93e3218884b9dc1a3febe4f576654e73231856c7e482e4671b9adaa4b9797d773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lewis-doc"

RDEPENDS:${PN} += ""

inherit rpm
