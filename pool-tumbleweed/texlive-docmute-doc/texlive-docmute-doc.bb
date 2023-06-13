SUMMARY = "Documentation for texlive-docmute"
DESCRIPTION = "This package includes the documentation for texlive-docmute"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn25741"

RPM_NAME = "texlive-docmute-doc-2023.201.1.4svn25741-52.1.noarch.rpm"
RPM_HASH = "5b3f8a1ed12ffae65c5ec051d15064ef2190a64b4d45b3a05261b84d5882bc1275654c1cb06495556d2076f1bd250b4576f6a3475b2f235daf9bae37b32bbfe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docmute-doc"

RDEPENDS:${PN} += ""

inherit rpm
