SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-rfc2136-2.6.0-1.3.noarch.rpm"
RPM_HASH = "742c3caff114fb0a2488668b32ca417b84280c72021df0ee2944bb36a03d185f0529da61ae187499d60f2cb095921b42599a6b652b8d616e90c87706bf4440ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-rfc2136 \
python39-certbot-dns-rfc2136 \
python3dist-certbot-dns-rfc2136"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dnspython"

inherit rpm
