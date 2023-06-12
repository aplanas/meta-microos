SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-dnsimple-1.31.0-1.4.noarch.rpm"
RPM_HASH = "8ef6c0f2fb1420aff71d9e5df7806b065c0a80462acbdce6c43e40ea72c9c18f5cd6a4f32e572dcb895d93db856b2ba6c38bfce52c4c7ec172f6d30bdc2e44be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-dnsimple) \
python311-certbot-dns-dnsimple \
python3dist(certbot-dns-dnsimple)"
RDEPENDS:${PN} += "python(abi) \
python311-acme \
python311-certbot \
python311-dns-lexicon \
python311-zope.interface"

inherit rpm
