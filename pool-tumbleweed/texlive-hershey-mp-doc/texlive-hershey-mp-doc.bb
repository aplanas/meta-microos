SUMMARY = "Documentation for texlive-hershey-mp"
DESCRIPTION = "This package includes the documentation for texlive-hershey-mp"
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-doc-2023.201.2022_1.0svn64878-53.1.noarch.rpm"
RPM_HASH = "545df92ba62f0446b8f9741a7b0b8074d2975a271567fe47444edea92893f327be311e9164ddf4116aa32843798393e5ee48900dc9a4bc87ed25a3df7ae9acbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
