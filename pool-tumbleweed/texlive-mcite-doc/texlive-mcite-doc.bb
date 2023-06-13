SUMMARY = "Documentation for texlive-mcite"
DESCRIPTION = "This package includes the documentation for texlive-mcite"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn18173"

RPM_NAME = "texlive-mcite-doc-2023.201.1.6svn18173-52.1.noarch.rpm"
RPM_HASH = "f95881d38f6a11f369f9dc095e56dac6a6d940e355ad4cbab0410a5d751f531fd89fef5a84a0b068a853b0aeda9460f5fbd6a301f1cd8dc0420020252cc2a593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
