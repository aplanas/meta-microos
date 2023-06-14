SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-doc-1.0.2u-16.1.noarch.rpm"
RPM_HASH = "6807ddca1990cb4ae5db72cac833b27348b963257f66703062be926083650b224a06fc7cb57ade7dea20d74aaa764cfb4c93223b29d03c60b55ef95906e14b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-0-0-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
