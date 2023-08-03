SUMMARY = "Documentation for texlive-mgltex"
DESCRIPTION = "This package includes the documentation for texlive-mgltex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.2svn63255"

RPM_NAME = "texlive-mgltex-doc-2023.209.4.2svn63255-55.1.noarch.rpm"
RPM_HASH = "93a9a80c5d659bf72b078402c40a2aa8a5cd12b8b51b2b7423134089d4ffd299f302155847f8be1b068f7b106c271eb98a5f18c389b1dbf3331f8a6b4eccfae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex-doc \
texlive-mgltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
