SUMMARY = "Documentation for texlive-paracol"
DESCRIPTION = "This package includes the documentation for texlive-paracol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.35svn49560"

RPM_NAME = "texlive-paracol-doc-2023.201.1.35svn49560-51.1.noarch.rpm"
RPM_HASH = "914f60c4f00734ed41c4aa8b709118ca1dec9a5e6668a4bdc1d15f7a813f0cd5e519fa310c19c5790cd0487809da81b75915916efdb320756d8826cf0b461da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paracol-doc"
RDEPENDS:${PN} += ""

inherit rpm
