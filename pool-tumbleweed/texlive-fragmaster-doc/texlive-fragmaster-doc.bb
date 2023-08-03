SUMMARY = "Documentation for texlive-fragmaster"
DESCRIPTION = "This package includes the documentation for texlive-fragmaster"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn26313"

RPM_NAME = "texlive-fragmaster-doc-2023.209.1.6svn26313-53.1.noarch.rpm"
RPM_HASH = "3626fe3e66da9f136050af50bc41c939bebbc80891cb0935d8d15675e76b5d0edd58e97aef426a0a9fac4dabf16bfd4e8102a30dbf032127374d936f68b2c9ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fragmaster-doc-en;de \
texlive-fragmaster-doc"

RDEPENDS:${PN} += ""

inherit rpm
