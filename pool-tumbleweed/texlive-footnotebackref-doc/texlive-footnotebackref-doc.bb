SUMMARY = "Documentation for texlive-footnotebackref"
DESCRIPTION = "This package includes the documentation for texlive-footnotebackref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27034"

RPM_NAME = "texlive-footnotebackref-doc-2023.209.1.0svn27034-53.1.noarch.rpm"
RPM_HASH = "f3282f6176a75a80f1e9bedd4075fee1da06435cc6cbf8318e1e9ffeb5cec0e6b730232fd29e195ca006280c6cb648e64d047c37bf4f2ac63180749ff29f8a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnotebackref-doc"

RDEPENDS:${PN} += ""

inherit rpm
