SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-luadns-1.31.0-1.4.noarch.rpm"
RPM_HASH = "b0bed8eff67d8e0607231dccabe118171cc1fae25f7fe4e44f999af687cb501240840223f5db11b08ebe9b032a9aedc8b2224d86f64bed6d5a55ee6d99785abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-luadns \
python3.10dist(certbot-dns-luadns) \
python310-certbot-dns-luadns \
python3dist(certbot-dns-luadns)"
RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
