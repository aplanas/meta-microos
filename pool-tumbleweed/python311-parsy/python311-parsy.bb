SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-parsy-1.3.0-1.9.noarch.rpm"
RPM_HASH = "52bf0a96a06136989ebcb64fa53fd9e73a0315aeb7985c3892a83dc94ee5e6207cff48d45a2add5ff13a68c62e6075ec335a836bcc6965b92eeb35173fba61e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsy \
python3.11dist-parsy \
python311-parsy \
python3dist-parsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
