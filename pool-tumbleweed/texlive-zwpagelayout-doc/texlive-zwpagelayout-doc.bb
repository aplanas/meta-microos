SUMMARY = "Documentation for texlive-zwpagelayout"
DESCRIPTION = "This package includes the documentation for texlive-zwpagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-doc-2023.201.1.4esvn63074-52.2.noarch.rpm"
RPM_HASH = "99b8e97aa1157926c2734570b50399f9fcbb4671d3b85a48c834e02ed51a6d15179237abea2be9fd04191fc877a827793f2170b6e64365deb6d924757f80f5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwpagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
