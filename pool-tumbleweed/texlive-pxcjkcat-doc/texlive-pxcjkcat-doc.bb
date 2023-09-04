SUMMARY = "Documentation for texlive-pxcjkcat"
DESCRIPTION = "This package includes the documentation for texlive-pxcjkcat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-doc-2023.209.1.4svn63967-54.2.noarch.rpm"
RPM_HASH = "70316650e12ff7feab823674583f60497f1ac0622cf57dec4654101b57e507af3d87c2ee41da75e54893b326cb4ed4bb03b1303c4426fdc3b147a8f8eb00ef71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxcjkcat-doc-ja;en \
texlive-pxcjkcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
