SUMMARY = "Documentation for texlive-exam-lite"
DESCRIPTION = "This package includes the documentation for texlive-exam-lite"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65754"

RPM_NAME = "texlive-exam-lite-doc-2023.209.svn65754-53.1.noarch.rpm"
RPM_HASH = "36e22c0ec9db8af473ab9c83198d39ef312589007e4773e2bb37527a6f4d67de1d5ed84b01c349fb3ebce153898dedbb5d9f5505291a00c1561375c95a87d8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-lite-doc"

RDEPENDS:${PN} += ""

inherit rpm
