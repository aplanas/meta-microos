SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-route53-2.6.0-1.3.noarch.rpm"
RPM_HASH = "155f7b2c8e944d741a689fda8a06afad0a4db06088e010959aaa92a7e4e171ebe7cc652a7052f8e3c7f90cdd8ad9c1d3dd59cde0ce85a76766ef81b3f57914b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-route53 \
python3.11dist-certbot-dns-route53 \
python311-certbot-dns-route53 \
python3dist-certbot-dns-route53"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-boto3 \
python311-certbot"

inherit rpm
