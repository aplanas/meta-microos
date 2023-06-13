SUMMARY = "Documentation for texlive-phfcc"
DESCRIPTION = "This package includes the documentation for texlive-phfcc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn60731"

RPM_NAME = "texlive-phfcc-doc-2023.201.2.0svn60731-51.1.noarch.rpm"
RPM_HASH = "94c746ee8049e02dc5932fa7d5e430a1f84b284982229d6e8ae27466939c4431deb8433495397d6a4145bec22a1a2d9a8706569b0fe1d6f2a6973a3f330a9427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfcc-doc"

RDEPENDS:${PN} += ""

inherit rpm
