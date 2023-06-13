SUMMARY = "Tool for bootstrapping CAs, certificate requests, and signed certificates"
DESCRIPTION = "Certstrap is a certificate manager for bootstrapping one's own \
certificate authority and public key infrastructure. \
certstrap can be used if you do not feel like dealing with openssl, \
its myriad of options or config files."
LICENSE = "Apache-2.0"

PV = "1.3.0+git20220701.1377eab"

RPM_NAME = "certstrap-1.3.0+git20220701.1377eab-1.6.aarch64.rpm"
RPM_HASH = "6f7cde0b5e2a76db09c5ca10adb608e9d926aa2aa62ca4656dfb0b633a2255c46afb2d05fda280ead308b62b49a6018cf28d124dd47bb7091cfa2290fa5234de"

RPROVIDES:${PN} += "certstrap \
certstrap(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
