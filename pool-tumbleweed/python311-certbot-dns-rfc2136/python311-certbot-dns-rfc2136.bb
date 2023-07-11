SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-rfc2136-2.6.0-1.3.noarch.rpm"
RPM_HASH = "c1b79f41f20cfed3ca7b179a1ad8f33399c33c6a72f8c0ea28f9e1d746681f939949ca253429c5514bdb422aea4cced0a1876f42c649ab1d5e036d0bfe67c62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-rfc2136 \
python3.11dist-certbot-dns-rfc2136 \
python311-certbot-dns-rfc2136 \
python3dist-certbot-dns-rfc2136"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dnspython"

inherit rpm
