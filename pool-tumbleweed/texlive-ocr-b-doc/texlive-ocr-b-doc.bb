SUMMARY = "Documentation for texlive-ocr-b"
DESCRIPTION = "This package includes the documentation for texlive-ocr-b"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20852"

RPM_NAME = "texlive-ocr-b-doc-2023.209.svn20852-55.1.noarch.rpm"
RPM_HASH = "cfccf5622f8cccd41f04f60e71e83ba9dce78cfef60dca3402e0095d405338d9f9be32a1f2bb3ea0fc59fdd3955e83759106e76a225624a62563c79054236640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-b-doc"

RDEPENDS:${PN} += ""

inherit rpm
