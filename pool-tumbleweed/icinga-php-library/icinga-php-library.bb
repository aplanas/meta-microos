SUMMARY = "Icinga PHP Library for Icinga Web 2"
DESCRIPTION = "This project bundles all Icinga PHP libraries into one \
piece and can be integrated as library into Icinga Web 2."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "icinga-php-library-0.12.0-1.1.noarch.rpm"
RPM_HASH = "c59bfc71eca03ea3cc3c3e289eccfd366761c9fd4b40c8ac702644c284d6159286e5c3be66f396a9e8d21ae22f39656a445491cb0cf170a30bce46b4661a3797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-library"

RDEPENDS:${PN} += "icinga-php-common"

inherit rpm
