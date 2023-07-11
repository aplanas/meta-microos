SUMMARY = "Documentation for texlive-image-gallery"
DESCRIPTION = "This package includes the documentation for texlive-image-gallery"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-doc-2023.208.1.0jsvn15878-53.1.noarch.rpm"
RPM_HASH = "eb58aeb1c406485d42cd66eaee50096028458568c6c7334ba049e722bc2e40a56bfd0abaf6663f865e8c7805ec54791a07a0666fb49254fe89320e07d778b23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-image-gallery-doc"

RDEPENDS:${PN} += ""

inherit rpm
