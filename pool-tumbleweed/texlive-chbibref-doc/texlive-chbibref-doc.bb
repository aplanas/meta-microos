SUMMARY = "Documentation for texlive-chbibref"
DESCRIPTION = "This package includes the documentation for texlive-chbibref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17120"

RPM_NAME = "texlive-chbibref-doc-2023.201.1.0svn17120-53.1.noarch.rpm"
RPM_HASH = "55452a63c80e680ef3140714d2d8fb066e94616200b105ac3e21aec9d10876e741c925279690ee6bfe83cfb43e0f3efa6b2feb65d9c51bb443fe11eff0cc871f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chbibref-doc"

RDEPENDS:${PN} += ""

inherit rpm
