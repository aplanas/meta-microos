SUMMARY = "Documentation for texlive-belleek"
DESCRIPTION = "This package includes the documentation for texlive-belleek"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-belleek-doc-2023.209.svn66115-54.1.noarch.rpm"
RPM_HASH = "c3483ea8be36ec0edc91d216aa6e2c7efc16861d6173f64a4f1421fb440d41452e320ff92b86e173515c10e6059626d6ad1f8a45586588cdc6cca98240a14275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-belleek-doc"

RDEPENDS:${PN} += ""

inherit rpm
