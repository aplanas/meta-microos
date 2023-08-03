SUMMARY = "Documentation for texlive-cmap"
DESCRIPTION = "This package includes the documentation for texlive-cmap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0jsvn57640"

RPM_NAME = "texlive-cmap-doc-2023.209.1.0jsvn57640-54.1.noarch.rpm"
RPM_HASH = "9e783c0ab989df788823b79709c77f7442ea8c766aa73ebc6c8a646bcf62e93889815ea9b20a7455ac7d463c43f91dc195c4b55a3165ac317bc209c97bc298db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
