SUMMARY = "Documentation for texlive-exceltex"
DESCRIPTION = "This package includes the documentation for texlive-exceltex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.1svn26313"

RPM_NAME = "texlive-exceltex-doc-2023.209.0.0.5.1svn26313-53.1.noarch.rpm"
RPM_HASH = "343408e4fffcf88ab1eb6c21e8647204f2eac653bd45adbcd4f1d58f9d718c36253ff260a9dfd26338481e6af242eac22b2f5ef21ca33b22a54478eddf2dff03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exceltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
