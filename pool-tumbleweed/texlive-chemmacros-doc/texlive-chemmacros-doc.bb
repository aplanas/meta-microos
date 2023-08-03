SUMMARY = "Documentation for texlive-chemmacros"
DESCRIPTION = "This package includes the documentation for texlive-chemmacros"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.2asvn62655"

RPM_NAME = "texlive-chemmacros-doc-2023.209.6.2asvn62655-54.1.noarch.rpm"
RPM_HASH = "0be64a3b9d80652ccdb1fdc31c99ab1ced36ccdf272dea69106b6c0a679b633f810170aa2f7f34f5e1e0bb7b1596de15ae390d99a6ae9efd4db0f85fc19198ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemmacros-doc-en \
texlive-chemmacros-doc"

RDEPENDS:${PN} += ""

inherit rpm
