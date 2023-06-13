SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-route53-1.31.0-1.3.noarch.rpm"
RPM_HASH = "1d270db285c85e55029787c105fa36b578b807f0ba2741ff4ed18ae3f9b7f2bd2214588f960fa20f856459d3cffcdc8744356010a41fa5a3c5bc3f4505dcf6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-route53 \
python3.10dist(certbot-dns-route53) \
python310-certbot-dns-route53 \
python3dist(certbot-dns-route53)"

RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-boto3 \
python310-certbot \
python310-zope.interface"

inherit rpm
