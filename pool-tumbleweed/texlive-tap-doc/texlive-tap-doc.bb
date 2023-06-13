SUMMARY = "Documentation for texlive-tap"
DESCRIPTION = "This package includes the documentation for texlive-tap"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.77svn31731"

RPM_NAME = "texlive-tap-doc-2023.201.0.0.77svn31731-54.1.noarch.rpm"
RPM_HASH = "d33c9ed8d0d2b54d4adb4da2334407cc31b8c87d97f032cda95cff4bf4428326850fc2baf7788135499df82f20dbde9db2f99d6fd7b9183677bd836cd5408c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tap-doc"

RDEPENDS:${PN} += ""

inherit rpm
