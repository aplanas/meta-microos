SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-2.6.0-1.3.noarch.rpm"
RPM_HASH = "47f018dfebf650cbf0e974c9a3a429fb7900c8e28b7ec8d0261aca91b0c1f3ad14d6a70b0bee2456cf42b5da59cbe1eb922ad04e3567adcc1a3172289e5a7400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3-certbot \
python3.11dist-certbot \
python311-certbot \
python3dist-certbot"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-acme \
python311-configargparse \
python311-configobj \
python311-cryptography \
python311-distro \
python311-josepy \
python311-parsedatetime \
python311-pyRFC3339 \
python311-pytz \
python311-setuptools \
update-alternatives"

inherit rpm
