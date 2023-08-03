SUMMARY = "Documentation for texlive-skeycommand"
DESCRIPTION = "This package includes the documentation for texlive-skeycommand"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn24652"

RPM_NAME = "texlive-skeycommand-doc-2023.209.0.0.4svn24652-58.1.noarch.rpm"
RPM_HASH = "5388106bfa03d2bd318eee2f4a291534a2d231dbd3f5817efa60fe2d81adb2a683f962835d56cbaf4afbb6514480c74fbc68aee7178190f02122ca015ed84415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeycommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
