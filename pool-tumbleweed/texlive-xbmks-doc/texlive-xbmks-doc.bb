SUMMARY = "Documentation for texlive-xbmks"
DESCRIPTION = "This package includes the documentation for texlive-xbmks"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53448"

RPM_NAME = "texlive-xbmks-doc-2023.209.svn53448-53.1.noarch.rpm"
RPM_HASH = "5ef7cea998b68f861c0a1191197db14fbbc791d08b5bc8ddfb07a497cbdc608c119b60ada35ee6ebd05ce68efcd9677d19592bdfec62b6a8e99374c32184f127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xbmks-doc"

RDEPENDS:${PN} += ""

inherit rpm
