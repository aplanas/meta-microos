SUMMARY = "Documentation for texlive-ean13isbn"
DESCRIPTION = "This package includes the documentation for texlive-ean13isbn"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57514"

RPM_NAME = "texlive-ean13isbn-doc-2023.209.svn57514-54.2.noarch.rpm"
RPM_HASH = "9d9f6ef061edc80ff8d4b71c6063c480175127c564509d7a9e55d6f3d40ac8dced36bca40248ac4f87a1de2df33d73746165287aeb0638ffdb61c82d61594185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean13isbn-doc"

RDEPENDS:${PN} += ""

inherit rpm
