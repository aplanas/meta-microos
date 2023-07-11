SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-route53-2.6.0-1.3.noarch.rpm"
RPM_HASH = "ad42cdc88829fae388f05c4e4be7112fad8bb4b303d072cae5f9482483fcf8b8e7128e98a159e02ea644b4c4bcc4f084035275f28313840f4c897b47a5fd122f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-route53 \
python310-certbot-dns-route53 \
python3dist-certbot-dns-route53"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-boto3 \
python310-certbot"

inherit rpm
