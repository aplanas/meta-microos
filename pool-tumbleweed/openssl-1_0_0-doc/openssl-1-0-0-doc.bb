SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-doc-1.0.2u-21.1.noarch.rpm"
RPM_HASH = "24f3715b7f3fbbe611e11899a3c4a04bf941219529b5a48e3cd911dde84dd8def4fb94f61f8753925b802ea6e08f6852fd2f37df922103c84e31841966184c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-0-0-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
