SUMMARY = "Documentation for texlive-juraabbrev"
DESCRIPTION = "This package includes the documentation for texlive-juraabbrev"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-juraabbrev-doc-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "d8d4c4b84f95e4d9d2793935ad0212970b1ccade9bb7a83de3dc65fbc827caa7d5f2678ed96fb2bc46dc3089375883881beb8f48bba55d03008bdb15130c391c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-juraabbrev-doc-de \
texlive-juraabbrev-doc"

RDEPENDS:${PN} += ""

inherit rpm
