SUMMARY = "Documentation for texlive-figbas"
DESCRIPTION = "This package includes the documentation for texlive-figbas"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn28943"

RPM_NAME = "texlive-figbas-doc-2023.209.1.0.3svn28943-53.1.noarch.rpm"
RPM_HASH = "e80b0a9abc79d71cc5ed9b41eb85ac913f0f5f808a590eb36dcc07db2bbd1d7a58fbd8b079f02c7586844aa7b364dbccf360009fd4412fef2ef1fe2b1f71adc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figbas-doc"

RDEPENDS:${PN} += ""

inherit rpm
