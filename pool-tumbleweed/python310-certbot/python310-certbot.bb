SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-2.6.0-1.3.noarch.rpm"
RPM_HASH = "01468ff0e4bf45588081fae9ea0d09ea5bc27cf635ace268bbcf81c854fa61a85bbe5209ecdbfcac3bc6298f681f95d43613e2465e26cb7391785062bc4ab0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3.10dist-certbot \
python310-certbot \
python3dist-certbot"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-acme \
python310-configargparse \
python310-configobj \
python310-cryptography \
python310-distro \
python310-josepy \
python310-parsedatetime \
python310-pyRFC3339 \
python310-pytz \
python310-setuptools \
update-alternatives"

inherit rpm
