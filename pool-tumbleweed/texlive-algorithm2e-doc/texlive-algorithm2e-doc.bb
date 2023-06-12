SUMMARY = "Documentation for texlive-algorithm2e"
DESCRIPTION = "This package includes the documentation for texlive-algorithm2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.2svn44846"

RPM_NAME = "texlive-algorithm2e-doc-2023.201.5.2svn44846-54.1.noarch.rpm"
RPM_HASH = "9718b9945945a709043b421204d0535898a20fbc7bdbe4a48721d8c7cc3bcaf343642a6dc98e7e126b2886f5c62a8b20a0dddaf3806265f40acfa872ba318c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithm2e-doc"
RDEPENDS:${PN} += ""

inherit rpm
