SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-rfc2136-1.31.0-1.3.noarch.rpm"
RPM_HASH = "5f37f235890d670cc506f41c07152bd1e049ebab678be2e147896aceb2ccb2e1d1ee755a8528a2681f75eba4498742a02b7a0c2134c938fb0ca486d6f8acfd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-rfc2136 \
python3.10dist(certbot-dns-rfc2136) \
python310-certbot-dns-rfc2136 \
python3dist(certbot-dns-rfc2136)"

RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-certbot \
python310-dnspython"

inherit rpm
