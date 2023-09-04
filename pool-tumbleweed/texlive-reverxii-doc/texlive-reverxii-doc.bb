SUMMARY = "Documentation for texlive-reverxii"
DESCRIPTION = "This package includes the documentation for texlive-reverxii"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63753"

RPM_NAME = "texlive-reverxii-doc-2023.209.svn63753-54.2.noarch.rpm"
RPM_HASH = "aee87b7800253fd8d5b7ec9ba030b16ff0b4b110a73dbef9c97c8a3c7c7fe7ae26dc0e2a2a04097199510162fdad4d1ab0cc022cd414dae883ada439ab5f43e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reverxii-doc"

RDEPENDS:${PN} += ""

inherit rpm
