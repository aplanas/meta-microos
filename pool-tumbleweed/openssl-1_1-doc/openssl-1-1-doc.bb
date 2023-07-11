SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "openssl-1_1-doc-1.1.1u-4.1.noarch.rpm"
RPM_HASH = "d29f704b1fccd37632e4eccb7533aebc67cb1e5babec14c19cb8007f3fc8e84046e1483d1a16ad4c8e08b0f9c1c6e6ab1ac5daaebaaa901342948757b3200053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-1-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
