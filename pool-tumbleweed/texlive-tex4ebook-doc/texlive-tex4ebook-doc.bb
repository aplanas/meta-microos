SUMMARY = "Documentation for texlive-tex4ebook"
DESCRIPTION = "This package includes the documentation for texlive-tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3isvn66332"

RPM_NAME = "texlive-tex4ebook-doc-2023.209.0.0.3isvn66332-55.1.noarch.rpm"
RPM_HASH = "929bc4a1d99cb952d829f89e94f38c12ff48d71fdc0da110fe0cfddda1da69b2df993c21ff579c6cace8bebd3c864491929d5bcfdfc189c2569265705136332e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex4ebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
