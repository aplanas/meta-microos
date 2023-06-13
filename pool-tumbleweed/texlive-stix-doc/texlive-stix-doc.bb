SUMMARY = "Documentation for texlive-stix"
DESCRIPTION = "This package includes the documentation for texlive-stix"
LICENSE = "OFL-1.1"

PV = "2023.201.1.1.3svn54512"

RPM_NAME = "texlive-stix-doc-2023.201.1.1.3svn54512-57.1.noarch.rpm"
RPM_HASH = "0646126236ad73bee25ce03c7870b0a0c91d3325d3250571e8776d3e4ae3116737acdb0825431411160ebdf067ead2c9dcdc6fbd4feecee4c397003b07c8694f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix-doc"

RDEPENDS:${PN} += ""

inherit rpm
