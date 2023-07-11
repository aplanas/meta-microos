SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-dnsimple-2.6.0-1.3.noarch.rpm"
RPM_HASH = "4ea90aeddc56db30141a389699128879887372a4654dd01fb1fd0ab8d8a53d876eeef152dfcb76065f33934c598c3ceef1065e2dc4d5c23d64acb75b3c9a9088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-dnsimple \
python3.11dist-certbot-dns-dnsimple \
python311-certbot-dns-dnsimple \
python3dist-certbot-dns-dnsimple"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
