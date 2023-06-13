SUMMARY = "Documentation for texlive-minim-hatching"
DESCRIPTION = "This package includes the documentation for texlive-minim-hatching"
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.1svn62395"

RPM_NAME = "texlive-minim-hatching-doc-2023.201.2022_1.1svn62395-54.1.noarch.rpm"
RPM_HASH = "ebc5ea80676db1b9851a155de5c756bea128eca569e5ef44c63f49e2fe7c664fc26326124b64bc67c740a5d9f01e2cfe3bfd85c8e8bf88a6fce5ca64bdcc0ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
