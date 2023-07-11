SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.1"

RPM_NAME = "python311-cloudflare-2.11.1-1.1.noarch.rpm"
RPM_HASH = "ebc8f86000109940733ba6203a65ba3383bca76a8e858286ffc15bc03a71484a8a7c1dc53d5e6a0d7ccdeaf70703a9f8ac3cfc6c0a04accf7ebe55b4d85f90ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudflare \
python3.11dist-cloudflare \
python311-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-beautifulsoup4 \
python311-future \
python311-jsonlines \
python311-requests \
update-alternatives"

inherit rpm
