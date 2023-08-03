SUMMARY = "Documentation for texlive-codeanatomy"
DESCRIPTION = "This package includes the documentation for texlive-codeanatomy"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4_betasvn65648"

RPM_NAME = "texlive-codeanatomy-doc-2023.209.0.0.4_betasvn65648-54.1.noarch.rpm"
RPM_HASH = "96efb2e59aefafb5028c39b31defc9c1dda7c3103ea8f1496407bec7fb51f85a2645cb3c98bb1223342f6fa3df45554b0ecc58552763364cd66e53c57eb27f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codeanatomy-doc"

RDEPENDS:${PN} += ""

inherit rpm
