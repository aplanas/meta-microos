SUMMARY = "Documentation for texlive-xetex-tibetan"
DESCRIPTION = "This package includes the documentation for texlive-xetex-tibetan"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-doc-2023.201.0.0.1svn28847-52.2.noarch.rpm"
RPM_HASH = "46bb5fed14a107126a84ab85806e0fb0fdc1d9eaea2e1c68a3cd8db2a492eb5301e37b7a1cf0d2444fb666ec3dbb28435027215e0d19816d2358c155894734b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-tibetan-doc"

RDEPENDS:${PN} += ""

inherit rpm
