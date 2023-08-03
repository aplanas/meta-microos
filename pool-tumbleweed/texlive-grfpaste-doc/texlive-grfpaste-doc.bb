SUMMARY = "Documentation for texlive-grfpaste"
DESCRIPTION = "This package includes the documentation for texlive-grfpaste"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-doc-2023.209.0.0.2svn17354-54.1.noarch.rpm"
RPM_HASH = "2f9234a3d566ced4f383ae7247b7cbbf3a0b838d06fb1e442eacb0940209c05a91fade35f3443d6661ed2bee7c48c708926663a5c299144b8484599e99864c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfpaste-doc"

RDEPENDS:${PN} += ""

inherit rpm
