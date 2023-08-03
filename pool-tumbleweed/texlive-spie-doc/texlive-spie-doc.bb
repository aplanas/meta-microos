SUMMARY = "Documentation for texlive-spie"
DESCRIPTION = "This package includes the documentation for texlive-spie"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.25svn15878"

RPM_NAME = "texlive-spie-doc-2023.209.3.25svn15878-58.1.noarch.rpm"
RPM_HASH = "4e963bddb279fa7655c71ba5ef18b00e34176b3d4823d13f366643e6526080923c90e8f4f269501aab10c20a1eaac0cbda55797d721019d887234274f33237ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spie-doc"

RDEPENDS:${PN} += ""

inherit rpm
