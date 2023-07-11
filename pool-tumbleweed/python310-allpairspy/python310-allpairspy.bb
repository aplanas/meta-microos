SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-allpairspy-2.5.0-2.5.noarch.rpm"
RPM_HASH = "bb9d310c1059e21cacdb22707fa06d3680a7867ec1b20e28ec0c46827c0d84ccc1a633de245a14e31cd06995856ef7c3c8af09694b9e9b735ac52340de3821c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-allpairspy \
python310-allpairspy \
python3dist-allpairspy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
