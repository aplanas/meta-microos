SUMMARY = "Documentation for texlive-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2fsvn56622"

RPM_NAME = "texlive-pst-pdf-doc-2023.209.1.2fsvn56622-54.2.noarch.rpm"
RPM_HASH = "78396edfee7fb0c173661f6729287e75f238d2ec4d8b87d621b2e9a93ea1ed724a2b8b308d0697ae3cd8d5158aaf33374d240f045b23f4867c42e1ef12115263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pdf-doc-de;en \
texlive-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
