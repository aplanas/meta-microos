SUMMARY = "Documentation for texlive-fontawesome5"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome5"
LICENSE = "OFL-1.1"

PV = "2023.209.5.15.4svn63207"

RPM_NAME = "texlive-fontawesome5-doc-2023.209.5.15.4svn63207-53.1.noarch.rpm"
RPM_HASH = "7c875840acf161e13be3e3c7ab49491df2ed3f74033d36ddfe3f33eb1fb1656f1443ed72a355f3371c7713e962b2ff334f66c582fd05f2f7378a3af8b4f9dbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome5-doc"

RDEPENDS:${PN} += ""

inherit rpm
