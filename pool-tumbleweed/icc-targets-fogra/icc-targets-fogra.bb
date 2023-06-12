SUMMARY = "FOGRA Printing Characterisation Data"
DESCRIPTION = "Printing characterisation data according to ISO 12647-2. \
These are CMYK characterisation data for coated, \
webcoated, uncoated, uncoatedyellowish and SC paper."
LICENSE = "Zlib"

PV = "1.0"

RPM_NAME = "icc-targets-fogra-1.0-16.21.noarch.rpm"
RPM_HASH = "e7974a675fbb6402e03c4dc5cfeb9a69308b18e7daa2fdd70ac1e0d62f69825deefd4ba61a1524ce3317113da0cebd6d659b35f5f6202af72aec20202d8f8e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-targets-fogra"
RDEPENDS:${PN} += "color-filesystem"

inherit rpm
