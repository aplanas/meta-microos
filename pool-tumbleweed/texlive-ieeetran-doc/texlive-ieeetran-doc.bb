SUMMARY = "Documentation for texlive-ieeetran"
DESCRIPTION = "This package includes the documentation for texlive-ieeetran"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-doc-2023.209.1.8bsvn59672-54.1.noarch.rpm"
RPM_HASH = "cc160370ef5c909f6557cbd6a33332fee6df64af0fa6b1c6e7bf17970113c3cb4cc6c567148f8616f8e5159975b11652098d2471bf72c87018bc4099ba5ef2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
