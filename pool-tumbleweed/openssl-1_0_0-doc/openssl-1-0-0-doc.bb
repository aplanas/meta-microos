SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-doc-1.0.2u-20.1.noarch.rpm"
RPM_HASH = "9c31da3b35e72afeb0eebe333a8222e12dd88ffc2dc400ea13476576e178809bab7e940892f3276184870f823ba91c711631c1ebabc2471c69da3d573c3aa265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-0-0-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
