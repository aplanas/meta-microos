SUMMARY = "Documentation for texlive-xbmks"
DESCRIPTION = "This package includes the documentation for texlive-xbmks"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53448"

RPM_NAME = "texlive-xbmks-doc-2023.201.svn53448-52.2.noarch.rpm"
RPM_HASH = "379926e8ca3408e65ab4e56201ce95adf6b0f2c0576b6aa8c265a127145b707f21a22c0dca5b2465c6b4a674f268de39d9d37dd2dc493b868525efd74db00c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xbmks-doc"

RDEPENDS:${PN} += ""

inherit rpm
