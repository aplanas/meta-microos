SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-dnsmadeeasy-1.31.0-1.4.noarch.rpm"
RPM_HASH = "6aba5f05feefee3f56d8d8c5053dd8202f36e9b70754f94d3194397be0185087bed41ee2f9ec229cc8bdd163a364ac87c23a6068922b75075d01daf751801f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-dnsmadeeasy) \
python311-certbot-dns-dnsmadeeasy \
python3dist(certbot-dns-dnsmadeeasy)"

RDEPENDS:${PN} += "python(abi) \
python311-acme \
python311-certbot \
python311-dns-lexicon \
python311-zope.interface"

inherit rpm
