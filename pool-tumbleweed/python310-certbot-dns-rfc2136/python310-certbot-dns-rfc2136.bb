SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-rfc2136-2.6.0-1.3.noarch.rpm"
RPM_HASH = "4b588b85354f16f5f8537fe45923572cc3b678d7f5bd654b9d4a704b5be5be806b9987758c6c3722106154fc4c6e70fff0e017f55dbc9e77cc924d74284a48d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-rfc2136 \
python310-certbot-dns-rfc2136 \
python3dist-certbot-dns-rfc2136"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dnspython"

inherit rpm
