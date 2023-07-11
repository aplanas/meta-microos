SUMMARY = "Binary files of latexfileversion"
DESCRIPTION = "Binary files of latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25012"

RPM_NAME = "texlive-latexfileversion-bin-2023.20230311.svn25012-92.1.aarch64.rpm"
RPM_HASH = "28cd4d52515f714d58f8ed5dbd78d9bca61770402e61642405906aa61abc4037801e35ddab464a9872fabcdc2c6c1338fc040f8fdb3d0b0f18c15f92c8ea566f"

RPROVIDES:${PN} += "texlive-latexfileversion-bin"

RDEPENDS:${PN} += "texlive-latexfileversion"

inherit rpm
