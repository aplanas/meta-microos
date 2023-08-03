SUMMARY = "Documentation for texlive-filehook"
DESCRIPTION = "This package includes the documentation for texlive-filehook"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8bsvn64822"

RPM_NAME = "texlive-filehook-doc-2023.209.0.0.8bsvn64822-53.1.noarch.rpm"
RPM_HASH = "366720f7d1bee206034ac7cf785fed5e54d7df78ab6f0deeeaac8a580247be6b39b5e95ddb7717c4bca99248781bdc6fa6fb31e28a2dd395a45426aad0cebdc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filehook-doc"

RDEPENDS:${PN} += ""

inherit rpm
