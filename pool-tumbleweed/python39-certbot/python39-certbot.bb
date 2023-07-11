SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-2.6.0-1.3.noarch.rpm"
RPM_HASH = "5a128489751405150ff7a499f89ead1f30c3302ca902a62fa6d7501339f6b27e77b45b20913d1413572885078ab11f7589febc583637253cf5f39e802f7d51cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3.9dist-certbot \
python39-certbot \
python3dist-certbot"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-acme \
python39-configargparse \
python39-configobj \
python39-cryptography \
python39-distro \
python39-josepy \
python39-parsedatetime \
python39-pyRFC3339 \
python39-pytz \
python39-setuptools \
update-alternatives"

inherit rpm
