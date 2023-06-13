SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-rfc2136-1.31.0-1.3.noarch.rpm"
RPM_HASH = "a959953f089e9903c7ba9643b21c39ad35715af1b27de21dd846e2a106f1556dd621bbbc4e0037ed66396f0583c72adb49fde264e42e6edd6de302362f4a4d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-rfc2136) \
python311-certbot-dns-rfc2136 \
python3dist(certbot-dns-rfc2136)"

RDEPENDS:${PN} += "python(abi) \
python311-acme \
python311-certbot \
python311-dnspython"

inherit rpm
