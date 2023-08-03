SUMMARY = "Documentation for texlive-outilsgeomtikz"
DESCRIPTION = "This package includes the documentation for texlive-outilsgeomtikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn66461"

RPM_NAME = "texlive-outilsgeomtikz-doc-2023.209.0.0.1.1svn66461-55.1.noarch.rpm"
RPM_HASH = "5e1a06d8f5ca81930062fe1da31699bac0ffdba949f31dae01da5668288b64ffd9199a1800393a5a12ec58e9e6e3c48ad019b4ec0ad4139c71e0f233efda39ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-outilsgeomtikz-doc-fr \
texlive-outilsgeomtikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
