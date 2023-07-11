SUMMARY = "Tool for bootstrapping CAs, certificate requests, and signed certificates"
DESCRIPTION = "Certstrap is a certificate manager for bootstrapping one's own \
certificate authority and public key infrastructure. \
certstrap can be used if you do not feel like dealing with openssl, \
its myriad of options or config files."
LICENSE = "Apache-2.0"

PV = "1.3.0+git20220701.1377eab"

RPM_NAME = "certstrap-1.3.0+git20220701.1377eab-1.7.aarch64.rpm"
RPM_HASH = "24ce366e20e2ca10ec27220ca52594dde048774d259d916af38639dec46d067b11bad84eae9fb58b035dfd0ba0e39bfd4d8b9d94b5c741ab674ffbe03b3015d7"

RPROVIDES:${PN} += "certstrap"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
