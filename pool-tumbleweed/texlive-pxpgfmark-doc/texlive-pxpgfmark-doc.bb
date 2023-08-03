SUMMARY = "Documentation for texlive-pxpgfmark"
DESCRIPTION = "This package includes the documentation for texlive-pxpgfmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-doc-2023.209.0.0.2svn30212-54.1.noarch.rpm"
RPM_HASH = "0e79613da426e02f0fe2c862958c66516f35199b9e7d8feefc1d8ce3aec0f748dd36eb1a3e26dcca9722ec4d4b56bcf19ec7cf58c400388bc51dcff00385d00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpgfmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
