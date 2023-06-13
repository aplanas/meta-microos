SUMMARY = "Documentation for texlive-apnum"
DESCRIPTION = "This package includes the documentation for texlive-apnum"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.7svn47510"

RPM_NAME = "texlive-apnum-doc-2023.201.1.7svn47510-54.1.noarch.rpm"
RPM_HASH = "1e610f7eae82cb2439afd275bf2a797fa40be37d4d430960eeea5a440025810d90712657d2991d9595bbac527077b52bc54c988862441c32eca6df47d2c65979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
