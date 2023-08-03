SUMMARY = "Documentation for texlive-thaienum"
DESCRIPTION = "This package includes the documentation for texlive-thaienum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn44140"

RPM_NAME = "texlive-thaienum-doc-2023.209.0.0.2svn44140-55.1.noarch.rpm"
RPM_HASH = "c40433851db8945652870973fb6470ccf4e94b542d283a9870df75932159f5c0a17c23169c6f9792299d83733e5006b365927dd41e15440c1c9a3fec6b72aa32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thaienum-doc"

RDEPENDS:${PN} += ""

inherit rpm
