SUMMARY = "Documentation for texlive-cmap"
DESCRIPTION = "This package includes the documentation for texlive-cmap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0jsvn57640"

RPM_NAME = "texlive-cmap-doc-2023.201.1.0jsvn57640-53.1.noarch.rpm"
RPM_HASH = "eb12045dae826b0288d54de92f368ef46b5029e66399b65bef1f31b428f4a29e531d32894b097ff878dfcc42f26ef76de2f8218f2e26639874f63f7786f51977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
