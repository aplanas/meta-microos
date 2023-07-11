SUMMARY = "Documentation for texlive-gradientframe"
DESCRIPTION = "This package includes the documentation for texlive-gradientframe"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-doc-2023.201.0.0.2svn21387-53.2.noarch.rpm"
RPM_HASH = "112d712a4483c60b065e7de62decca8de6d978e273378b461cd4020e5a199680e19ee2f0e1eba97551633dd29d0560e029f44e27e4d7ea815ec53fd7c2fd48d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradientframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
