SUMMARY = "Supporting module for SOAP::Lite"
DESCRIPTION = "supporting module for SOAP::Lite"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-IO-SessionData-1.03-3.28.noarch.rpm"
RPM_HASH = "35b42fa58206efd9b2c4bb1e78c544b6a700bb47f1b90383e2b3e3ee3d08b9f551acebe857b660ec55994ad12d9b1a188335a9e4008078ef5c9f5548af0046e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--SessionData \
perl-IO--SessionSet \
perl-IO-SessionData"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
