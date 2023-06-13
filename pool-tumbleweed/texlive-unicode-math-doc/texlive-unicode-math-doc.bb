SUMMARY = "Documentation for texlive-unicode-math"
DESCRIPTION = "This package includes the documentation for texlive-unicode-math"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8qsvn61719"

RPM_NAME = "texlive-unicode-math-doc-2023.201.0.0.8qsvn61719-53.1.noarch.rpm"
RPM_HASH = "9be2ff21f79f5a01935bbc1ec0dedbbbacbe00db745e9b241d1e49c45f40eacc1e64efdfb49c9fc2af78f75db47c9c9657051b8145fbe72bc151c3b8cc0bcc7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
