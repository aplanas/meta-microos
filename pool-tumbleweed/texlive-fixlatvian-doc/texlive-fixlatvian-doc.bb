SUMMARY = "Documentation for texlive-fixlatvian"
DESCRIPTION = "This package includes the documentation for texlive-fixlatvian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1asvn21631"

RPM_NAME = "texlive-fixlatvian-doc-2023.201.1asvn21631-52.1.noarch.rpm"
RPM_HASH = "1852f0fdc3508ce504f9b5147e27e56756087a373317757ae870c231b885490ec2732727429c501b4290bbfbc8f0226322a65de746f986cc8e923343c0d8ec7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fixlatvian-doc-lv \
texlive-fixlatvian-doc"

RDEPENDS:${PN} += ""

inherit rpm
