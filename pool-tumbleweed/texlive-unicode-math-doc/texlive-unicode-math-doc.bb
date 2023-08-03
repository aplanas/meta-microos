SUMMARY = "Documentation for texlive-unicode-math"
DESCRIPTION = "This package includes the documentation for texlive-unicode-math"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8qsvn61719"

RPM_NAME = "texlive-unicode-math-doc-2023.209.0.0.8qsvn61719-54.1.noarch.rpm"
RPM_HASH = "5b7c84dabf828a1bc1a1980660c3a7828ca055f2fb016157cf08dde3cad2713c507b2e683bd038a7c539f4e2ac9a2934dbc0a0e5e26f171e2a8572608b4615f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
