SUMMARY = "Documentation for texlive-paresse"
DESCRIPTION = "This package includes the documentation for texlive-paresse"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0.2svn59228"

RPM_NAME = "texlive-paresse-doc-2023.201.5.0.2svn59228-51.1.noarch.rpm"
RPM_HASH = "774dbbcc29945eb5b692201503c590d6e8180a9db5e9e7a222dc12f8eebd74a045b08855f616e76cd92857d3a4a79af41237c99b2a3395d3334bac497d6aa98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-paresse-doc:fr) \
texlive-paresse-doc"

RDEPENDS:${PN} += ""

inherit rpm
