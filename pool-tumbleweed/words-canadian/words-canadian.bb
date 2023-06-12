SUMMARY = "A Canadian words dictionary"
DESCRIPTION = "This package contains a Canadian words dictionary which will be installed as \
 \
/usr/share/dict/canadian \
 \
For a description see the package words."
LICENSE = "SUSE-Public-Domain"

PV = "2020.12.07"

RPM_NAME = "words-canadian-2020.12.07-2.1.noarch.rpm"
RPM_HASH = "d9059b62b26cff587420c107e876294a6751ab7d45b2107b5dcacbec4016795f7dd79b7a584a0d05a2c54a56e0ec1b35fd9b500dc7912d860fe78395b8f8571d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "words-canadian"
RDEPENDS:${PN} += "words"

inherit rpm
