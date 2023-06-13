SUMMARY = "Documentation for texlive-crimson"
DESCRIPTION = "This package includes the documentation for texlive-crimson"
LICENSE = "OFL-1.1"

PV = "2023.204.svn64559"

RPM_NAME = "texlive-crimson-doc-2023.204.svn64559-54.1.noarch.rpm"
RPM_HASH = "80e07153bc30e8a200792e1e92aa7340ee56a2b106997d294cb418202bc0d31274cc9b7102672d48f3f5ae5c6efe7cbe72fe8e1cdbd1fd53253af19dade7cf58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crimson-doc"

RDEPENDS:${PN} += ""

inherit rpm
