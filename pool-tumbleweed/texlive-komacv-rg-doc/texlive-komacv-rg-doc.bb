SUMMARY = "Documentation for texlive-komacv-rg"
DESCRIPTION = "This package includes the documentation for texlive-komacv-rg"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.2svn49064"

RPM_NAME = "texlive-komacv-rg-doc-2023.201.0.0.9.2svn49064-55.1.noarch.rpm"
RPM_HASH = "aec5e650a4e38fc703bacf2c2618b1dd053876c97d7436bb88bac58cd2bd7df6f85afb7cf6de071e408d0d196d1a660bd7c297a47e25e83a00c2caa83f57b879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-komacv-rg-doc"

RDEPENDS:${PN} += ""

inherit rpm
