SUMMARY = "Documentation for texlive-newsletr"
DESCRIPTION = "This package includes the documentation for texlive-newsletr"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-newsletr-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "f8a4dbf4887eb47924b569f06fd2ac0e152c9ef9403ab95f13f1bceb5e44470d69078ce5569a487cd7ba0633e950ad396c5e7adb0d422f6de8e9aec579d952eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newsletr-doc"
RDEPENDS:${PN} += ""

inherit rpm
