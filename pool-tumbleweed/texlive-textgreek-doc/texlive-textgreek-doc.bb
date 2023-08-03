SUMMARY = "Documentation for texlive-textgreek"
DESCRIPTION = "This package includes the documentation for texlive-textgreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn44192"

RPM_NAME = "texlive-textgreek-doc-2023.209.0.0.7svn44192-55.1.noarch.rpm"
RPM_HASH = "409c2ffe01ec97df870b2ed5d511474c726f4ddd298dd6e5c404add671a9308324cdc56cc7e944b3b275ba0b485ef96a018e797217436b2d78b65b8abb54aeb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
