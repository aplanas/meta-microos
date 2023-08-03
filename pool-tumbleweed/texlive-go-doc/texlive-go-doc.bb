SUMMARY = "Documentation for texlive-go"
DESCRIPTION = "This package includes the documentation for texlive-go"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28628"

RPM_NAME = "texlive-go-doc-2023.209.svn28628-54.1.noarch.rpm"
RPM_HASH = "c4d0643bb351ff5aff7c58afe167d0799f2c550c0a600063b9d23ccd4c2f6f11dbec887688e851c8092dfd43f96ce484d6025c8bf1b40dceecb81b46c719f40d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-go-doc"

RDEPENDS:${PN} += ""

inherit rpm
