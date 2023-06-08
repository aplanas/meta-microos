SUMMARY = "Tool for bootstrapping CAs, certificate requests, and signed certificates"
DESCRIPTION = "Certstrap is a certificate manager for bootstrapping one's own \
certificate authority and public key infrastructure. \
certstrap can be used if you do not feel like dealing with openssl, \
its myriad of options or config files."
LICENSE = "Apache-2.0"

PV = "1.3.0+git20220701.1377eab"

RPM_NAME = "certstrap-1.3.0+git20220701.1377eab-1.5.aarch64.rpm"
RPM_HASH = "b621ce3ec941c48bad9b3a5cd15b55fe3ccb510654db72610dee21bdd2ac5faa9c8bc786b199343608ab7ef93924f97ce341c6318fa766bc5220f4ac106e2588"

RPROVIDES:${PN} += "certstrap certstrap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
