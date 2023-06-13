SUMMARY = "Provides libknet1 crypto plugins meta package"
DESCRIPTION = "Provides meta package to install all of libknet1 crypto plugins"
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-crypto-plugins-all-1.21-1.10.aarch64.rpm"
RPM_HASH = "6a8ecb832c27fbefdbcb833af645bb9e21671c74b544c1ca4fd0c3db8153ce0a49341188c09fe5a4c17c5e94de4cd387246ea156f153ad33c3c5046beb0a8e98"

RPROVIDES:${PN} += "libknet1-crypto-plugins-all \
libknet1-crypto-plugins-all(aarch-64)"

RDEPENDS:${PN} += "libknet1-crypto-nss-plugin(aarch-64) \
libknet1-crypto-openssl-plugin(aarch-64)"

inherit rpm
