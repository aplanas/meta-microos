SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-cloudflare-2.6.0-1.3.noarch.rpm"
RPM_HASH = "cc8e03eaafeb452d52ef7bb3694950a812884b715380b92dc432691e4af7b3143ec49a043bbfb47d133ec52a74e549921d5e781d81daa7d0bf91dfe2a30ec788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-cloudflare \
python39-certbot-dns-cloudflare \
python3dist-certbot-dns-cloudflare"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-cloudflare"

inherit rpm
