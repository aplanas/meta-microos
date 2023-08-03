SUMMARY = "Documentation for texlive-xebaposter"
DESCRIPTION = "This package includes the documentation for texlive-xebaposter"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.53svn63513"

RPM_NAME = "texlive-xebaposter-doc-2023.209.2.53svn63513-53.1.noarch.rpm"
RPM_HASH = "f9facc0dea2b8810176ed5ec319e6f20afda94a4777ac8dbf5ee7329ec1cd3a3ad7fb119b05dbabe7b9f5e762033cb3f7c8d3c6766bf7498003793a0423ffb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xebaposter-doc-fa \
texlive-xebaposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
