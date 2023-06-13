SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-dnsimple-1.31.0-1.4.noarch.rpm"
RPM_HASH = "5df0af05bce7f18793bd821f0add22c86ab5ba84d92f1bf6e0234b4920ac1f2f3baee80a260e214fd83cae8fb4ff51099d3b248614f1fab7be6516ba4424ef54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-dnsimple \
python3.10dist(certbot-dns-dnsimple) \
python310-certbot-dns-dnsimple \
python3dist(certbot-dns-dnsimple)"

RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-certbot \
python310-dns-lexicon \
python310-zope.interface"

inherit rpm
