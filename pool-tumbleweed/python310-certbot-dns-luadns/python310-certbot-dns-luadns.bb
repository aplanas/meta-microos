SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-luadns-2.6.0-1.3.noarch.rpm"
RPM_HASH = "386f4158b3aebef81f313fe2aec25fae71a0fcde59984fa1e591b26b875ecd1b63d9262d64b7359756a7c530217f955c96c94bb9ca2155884c3ef53295fd2121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-luadns \
python310-certbot-dns-luadns \
python3dist-certbot-dns-luadns"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
