SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-route53-2.6.0-1.3.noarch.rpm"
RPM_HASH = "26456d5808d222dbe506874cc1c6a01d527d6f8108731974336e21ef2bd4cbccd1dc79ef63f308f25b02ba15258ebb42c246ff8bccdc01d2227c4b8246001ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-route53 \
python39-certbot-dns-route53 \
python3dist-certbot-dns-route53"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-boto3 \
python39-certbot"

inherit rpm
