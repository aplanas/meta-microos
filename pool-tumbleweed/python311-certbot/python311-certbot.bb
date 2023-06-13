SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-1.31.0-1.4.noarch.rpm"
RPM_HASH = "142245509b28cb311ba3eb9831e6179e05c37fa2ad5d562bd4774efad4a59b4ee9d8d0e970c2ae279cdb696a06f458b8e389c25fd309b9d520dcd8e1ab10eda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3.11dist(certbot) \
python311-certbot \
python3dist(certbot)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-acme \
python311-configargparse \
python311-configobj \
python311-cryptography \
python311-distro \
python311-future \
python311-josepy \
python311-parsedatetime \
python311-pyRFC3339 \
python311-pytz \
python311-setuptools \
python311-zope.component \
python311-zope.interface \
update-alternatives"

inherit rpm
