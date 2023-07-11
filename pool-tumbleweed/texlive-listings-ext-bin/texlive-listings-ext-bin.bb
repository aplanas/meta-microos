SUMMARY = "Binary files of listings-ext"
DESCRIPTION = "Binary files of listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15093"

RPM_NAME = "texlive-listings-ext-bin-2023.20230311.svn15093-92.1.aarch64.rpm"
RPM_HASH = "3efe3852a21c6792a3679c0ae7082b3ece22be3c47573dbc0aa4c1f50d23ff0f7c8a2c5d18f3ea913225d1942efe620b39ef359d2e0bcfbd2b63083ee4f8aff9"

RPROVIDES:${PN} += "texlive-listings-ext-bin"

RDEPENDS:${PN} += "texlive-listings-ext"

inherit rpm
