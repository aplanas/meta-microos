SUMMARY = "Documentation for texlive-labelschanged"
DESCRIPTION = "This package includes the documentation for texlive-labelschanged"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn46040"

RPM_NAME = "texlive-labelschanged-doc-2023.201.1.0svn46040-55.1.noarch.rpm"
RPM_HASH = "97995212b1ccea78dc660fbebe3723a6c201d8b999d53e9135c21427c7307c1e27fca896cab090b0e9e7cae852ee4b6a0fc45726ec0909827ce9f3a675d5a79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labelschanged-doc"
RDEPENDS:${PN} += ""

inherit rpm
