SUMMARY = "CloudXNS Authenticator plugin for Certbot"
DESCRIPTION = "CloudXNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-cloudxns-1.31.0-1.4.noarch.rpm"
RPM_HASH = "1ffd3b36ddcd0bc9ce2b27c0e80318e8bbbe8ecefc0ebeeb1a9d72a73b00d6b83c2677542c1ae13ceff64d99c43577affa5823276c422a066285505f6ab067a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-cloudxns \
python3.10dist(certbot-dns-cloudxns) \
python310-certbot-dns-cloudxns \
python3dist(certbot-dns-cloudxns)"

RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-certbot \
python310-dns-lexicon \
python310-zope.interface"

inherit rpm
