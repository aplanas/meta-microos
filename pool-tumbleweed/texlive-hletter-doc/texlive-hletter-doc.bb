SUMMARY = "Documentation for texlive-hletter"
DESCRIPTION = "This package includes the documentation for texlive-hletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn30002"

RPM_NAME = "texlive-hletter-doc-2023.201.4.2svn30002-53.1.noarch.rpm"
RPM_HASH = "445be5700a19e672757cbd544399c77ba51a474ac4f86044d87da2620013b14d81c60d27d618a984f60618742a113136b75f6220a32b997f74154ca1ce346537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
