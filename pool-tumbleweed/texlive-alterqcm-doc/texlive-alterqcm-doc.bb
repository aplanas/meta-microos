SUMMARY = "Documentation for texlive-alterqcm"
DESCRIPTION = "This package includes the documentation for texlive-alterqcm"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.42csvn59265"

RPM_NAME = "texlive-alterqcm-doc-2023.209.4.42csvn59265-55.1.noarch.rpm"
RPM_HASH = "d639ef8e0ba00fbc5570d6c384d32899ade02854550c3a64294ca9e95f5cff2cbad0906c6f8f63ae1215fc4f1561fcc561f1ed65b35e283d942e1e5703d5a56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-alterqcm-doc-en \
texlive-alterqcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
