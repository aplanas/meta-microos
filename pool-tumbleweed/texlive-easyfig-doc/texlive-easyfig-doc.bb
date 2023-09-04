SUMMARY = "Documentation for texlive-easyfig"
DESCRIPTION = "This package includes the documentation for texlive-easyfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn64967"

RPM_NAME = "texlive-easyfig-doc-2023.209.1.2asvn64967-54.2.noarch.rpm"
RPM_HASH = "7d7be9be01b07f75c45fab107cf86f7dc582714e8ef78f9d32f1b14e937f9a6735eabbbdd1eba9168e141d5788b204c79ed8ba711640a495e22235087a3fb6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
