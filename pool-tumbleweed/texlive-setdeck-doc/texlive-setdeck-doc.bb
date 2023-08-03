SUMMARY = "Documentation for texlive-setdeck"
DESCRIPTION = "This package includes the documentation for texlive-setdeck"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn40613"

RPM_NAME = "texlive-setdeck-doc-2023.209.0.0.1svn40613-54.1.noarch.rpm"
RPM_HASH = "62a75b1c05b30627941fb80244c06a32903f04e03d109e19b94ed364c553f64641c8200763e37f681d135f92ec7ccd3de526e05993c13267a35322f5a92ab3db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setdeck-doc"

RDEPENDS:${PN} += ""

inherit rpm
