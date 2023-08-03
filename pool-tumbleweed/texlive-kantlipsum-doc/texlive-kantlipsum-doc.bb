SUMMARY = "Documentation for texlive-kantlipsum"
DESCRIPTION = "This package includes the documentation for texlive-kantlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8asvn51727"

RPM_NAME = "texlive-kantlipsum-doc-2023.209.0.0.8asvn51727-56.1.noarch.rpm"
RPM_HASH = "f35bb470a9739dc26e7d4ee398ddb0d4632bf32d7a8b828671ce9c2f6e59693367ab4f0335e237d9a16e8b39ac45e767c13f115b6b3709a95e3f509868309f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kantlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
