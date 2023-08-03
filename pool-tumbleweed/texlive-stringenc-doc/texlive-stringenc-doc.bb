SUMMARY = "Documentation for texlive-stringenc"
DESCRIPTION = "This package includes the documentation for texlive-stringenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn52982"

RPM_NAME = "texlive-stringenc-doc-2023.209.1.12svn52982-58.1.noarch.rpm"
RPM_HASH = "8216ea65cf5be2c9eb9a4595163447b4975b7403a25c73495e5d075ed2d8091c9b238d7108f3a8a1c4b600915bf6be0fae20b8b4898f181c6594b0cd603c223f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stringenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
