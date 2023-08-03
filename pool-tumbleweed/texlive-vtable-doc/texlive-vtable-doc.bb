SUMMARY = "Documentation for texlive-vtable"
DESCRIPTION = "This package includes the documentation for texlive-vtable"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51126"

RPM_NAME = "texlive-vtable-doc-2023.209.1.0svn51126-54.1.noarch.rpm"
RPM_HASH = "442b660e0900000ecd82333379ec82ec6d550c85042ad5ccbffaf91fcf834c54e54f49dda2a24cc38ee0a43cee4a05c57fc08b9f43eaa9293b103a571f6e4464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
