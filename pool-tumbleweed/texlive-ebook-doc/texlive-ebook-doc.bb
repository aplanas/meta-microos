SUMMARY = "Documentation for texlive-ebook"
DESCRIPTION = "This package includes the documentation for texlive-ebook"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn29466"

RPM_NAME = "texlive-ebook-doc-2023.209.svn29466-54.1.noarch.rpm"
RPM_HASH = "88016e6a8dba6e740dfa76c5c1848824f6835a606a452f229e1d1d9cbb90e9e830e2e46bce2725f0ba4154d06995381c39b2530f4774401cc9850dcf6a67306f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
