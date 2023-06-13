SUMMARY = "Documentation for texlive-sectionbreak"
DESCRIPTION = "This package includes the documentation for texlive-sectionbreak"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1dsvn50339"

RPM_NAME = "texlive-sectionbreak-doc-2023.201.0.0.1dsvn50339-53.1.noarch.rpm"
RPM_HASH = "fc0a457bd54fd2e4753f13592afe26214a96b755fc349f87835d0e94a7fd68e258f74128bae7433752b2f64c385adedbcf8defe60e492d4ebb90147218901635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectionbreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
