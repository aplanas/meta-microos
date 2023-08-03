SUMMARY = "Documentation for texlive-e-french"
DESCRIPTION = "This package includes the documentation for texlive-e-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.11svn52027"

RPM_NAME = "texlive-e-french-doc-2023.209.6.11svn52027-54.1.noarch.rpm"
RPM_HASH = "5bf0155ec00aa3a9cb773bf5951559cd6f00d28a56fd2e02e6859233c0d9a9d687fa1abe45c70e7b26c82b2b640005e16a0630863146ab027ac8bd6e682d6ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-e-french-doc-en;fr \
texlive-e-french-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
