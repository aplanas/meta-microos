SUMMARY = "Documentation for texlive-venndiagram"
DESCRIPTION = "This package includes the documentation for texlive-venndiagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn47952"

RPM_NAME = "texlive-venndiagram-doc-2023.201.1.2svn47952-53.1.noarch.rpm"
RPM_HASH = "13d8785b412330c7eaac3a2318e012a3ca70582d7340e447c4b2471f33973f08e0d763431b5e5b459c7666776f7e8059e26ac1cb71bb1a86fdc1d9f4be3591ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venndiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
