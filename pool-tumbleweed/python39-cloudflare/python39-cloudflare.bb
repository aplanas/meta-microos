SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.7"

RPM_NAME = "python39-cloudflare-2.11.7-2.1.noarch.rpm"
RPM_HASH = "a5bca788b0666ade38c529695a68d8028843f20d4e2e6a7653bf99587f86a7e113d60ee513bb7eb319eacc3120cdc165707a4e3ec2da9208140f500bb447f752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloudflare \
python39-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-beautifulsoup4 \
python39-jsonlines \
python39-requests \
update-alternatives"

inherit rpm
