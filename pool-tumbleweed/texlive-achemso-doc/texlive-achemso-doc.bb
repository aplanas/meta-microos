SUMMARY = "Documentation for texlive-achemso"
DESCRIPTION = "This package includes the documentation for texlive-achemso"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.13fsvn65103"

RPM_NAME = "texlive-achemso-doc-2023.209.3.13fsvn65103-55.1.noarch.rpm"
RPM_HASH = "f5c13645da1145e0d16fcfbf1fff1f0e24f32293db476f5205fcbe175e66662f6be5a9ffaefaa05ef3de997670f68b0a8f7ca62a5fb5d17a9d2aad5745d795e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-achemso-doc"

RDEPENDS:${PN} += ""

inherit rpm
