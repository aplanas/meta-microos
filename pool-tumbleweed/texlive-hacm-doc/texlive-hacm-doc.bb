SUMMARY = "Documentation for texlive-hacm"
DESCRIPTION = "This package includes the documentation for texlive-hacm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27671"

RPM_NAME = "texlive-hacm-doc-2023.201.0.0.1svn27671-53.1.noarch.rpm"
RPM_HASH = "8a71eb033f03ca7c755daa350d0579ddf95d4d782d943317921293a01059eef1c100ee4e629ac22b6a6ca25c099ed6d4048d71c07b4c5cec483c041f7ce24134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hacm-doc"

RDEPENDS:${PN} += ""

inherit rpm
