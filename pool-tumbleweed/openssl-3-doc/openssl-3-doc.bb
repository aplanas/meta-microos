SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3-doc-3.1.1-3.1.noarch.rpm"
RPM_HASH = "c889a149071ded00c0038bbd4e145dbf8d42fb8ecf09b7ada6850b3b2f16c8f93c7053b9ab40ed09a653d0e19f243ef95e689838de6d9ec781f18a156f4764f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-3-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
