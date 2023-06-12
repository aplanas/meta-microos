SUMMARY = "Icinga PHP Library for Icinga Web 2"
DESCRIPTION = "This project bundles all Icinga PHP libraries into one \
piece and can be integrated as library into Icinga Web 2."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "icinga-php-library-0.11.0-1.1.noarch.rpm"
RPM_HASH = "c34731802f41b510486a5920b9f22283c57dee9cd06fa29a7b42572db8d81fa1a7bbf0c384892e646690fa52e253a6abfa2e0c4af9681f0fc1cbf7be5236a309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-library"
RDEPENDS:${PN} += "icinga-php-common"

inherit rpm
