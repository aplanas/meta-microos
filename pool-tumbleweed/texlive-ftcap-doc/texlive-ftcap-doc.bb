SUMMARY = "Documentation for texlive-ftcap"
DESCRIPTION = "This package includes the documentation for texlive-ftcap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn17275"

RPM_NAME = "texlive-ftcap-doc-2023.209.1.4svn17275-53.1.noarch.rpm"
RPM_HASH = "329207b05cbe6683c5db77d688dc55400bf0b8732494ff351315f1b5a42a6f34a99a5250986638c3b7f5f69ecb4ff52fce056c6ebf4f64aaeab31606aadf4fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftcap-doc"

RDEPENDS:${PN} += ""

inherit rpm
