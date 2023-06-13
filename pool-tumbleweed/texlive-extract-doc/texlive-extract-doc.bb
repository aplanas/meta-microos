SUMMARY = "Documentation for texlive-extract"
DESCRIPTION = "This package includes the documentation for texlive-extract"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9asvn52117"

RPM_NAME = "texlive-extract-doc-2023.201.1.9asvn52117-52.1.noarch.rpm"
RPM_HASH = "c9f0e9c1ddf47ec3f02674413c4b7add899c1970cd0688d50eae435abe70c042410171803d935762f98f62e2a77eb0dd4e78d7983891bb2e89a7b37826a9110b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extract-doc"

RDEPENDS:${PN} += ""

inherit rpm
