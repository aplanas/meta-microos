SUMMARY = "A Health and Hospital Information System"
DESCRIPTION = "GNU Health is the Hospital Information System adopted by the United \
Nations University, International Institute for Global Health, for \
the implementations and trainings. \
 \
This is the server component of GNU Health. \
You would need the GNU Health Client as well, on the same or a different machine. \
You may use the Tryton Client either \
See https://en.opensuse.org/GNUHealth_on_openSUSE for instructions"
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "gnuhealth-4.2.1-1.1.noarch.rpm"
RPM_HASH = "2f638124e7b9b64ca9ebe4750db5ed199745aa07d5515c8b894073d9d78c2d5385d00317e74a33e98424b223ae300ff002ed1545a52018a84ee8ca3b3b98b185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth \
python3.10dist-gnuhealth \
python3.10dist-gnuhealth-archives \
python3.10dist-gnuhealth-caldav \
python3.10dist-gnuhealth-calendar \
python3.10dist-gnuhealth-contact-tracing \
python3.10dist-gnuhealth-crypto \
python3.10dist-gnuhealth-crypto-lab \
python3.10dist-gnuhealth-dentistry \
python3.10dist-gnuhealth-disability \
python3.10dist-gnuhealth-ems \
python3.10dist-gnuhealth-federation \
python3.10dist-gnuhealth-genetics \
python3.10dist-gnuhealth-genetics-uniprot \
python3.10dist-gnuhealth-gyneco \
python3.10dist-gnuhealth-history \
python3.10dist-gnuhealth-icd10 \
python3.10dist-gnuhealth-icd10pcs \
python3.10dist-gnuhealth-icd11 \
python3.10dist-gnuhealth-icd9procs \
python3.10dist-gnuhealth-icpm \
python3.10dist-gnuhealth-icu \
python3.10dist-gnuhealth-imaging \
python3.10dist-gnuhealth-inpatient \
python3.10dist-gnuhealth-inpatient-calendar \
python3.10dist-gnuhealth-insurance \
python3.10dist-gnuhealth-iss \
python3.10dist-gnuhealth-lab \
python3.10dist-gnuhealth-lifestyle \
python3.10dist-gnuhealth-mdg6 \
python3.10dist-gnuhealth-ntd \
python3.10dist-gnuhealth-ntd-chagas \
python3.10dist-gnuhealth-ntd-dengue \
python3.10dist-gnuhealth-nursing \
python3.10dist-gnuhealth-ophthalmology \
python3.10dist-gnuhealth-pediatrics \
python3.10dist-gnuhealth-pediatrics-growth-charts \
python3.10dist-gnuhealth-pediatrics-growth-charts-who \
python3.10dist-gnuhealth-profile \
python3.10dist-gnuhealth-qrcodes \
python3.10dist-gnuhealth-reporting \
python3.10dist-gnuhealth-services \
python3.10dist-gnuhealth-services-imaging \
python3.10dist-gnuhealth-services-lab \
python3.10dist-gnuhealth-socioeconomics \
python3.10dist-gnuhealth-stock \
python3.10dist-gnuhealth-surgery \
python3.10dist-gnuhealth-webdav3-server \
python3.10dist-gnuhealth-who-essential-medicines \
python3dist-gnuhealth \
python3dist-gnuhealth-archives \
python3dist-gnuhealth-caldav \
python3dist-gnuhealth-calendar \
python3dist-gnuhealth-contact-tracing \
python3dist-gnuhealth-crypto \
python3dist-gnuhealth-crypto-lab \
python3dist-gnuhealth-dentistry \
python3dist-gnuhealth-disability \
python3dist-gnuhealth-ems \
python3dist-gnuhealth-federation \
python3dist-gnuhealth-genetics \
python3dist-gnuhealth-genetics-uniprot \
python3dist-gnuhealth-gyneco \
python3dist-gnuhealth-history \
python3dist-gnuhealth-icd10 \
python3dist-gnuhealth-icd10pcs \
python3dist-gnuhealth-icd11 \
python3dist-gnuhealth-icd9procs \
python3dist-gnuhealth-icpm \
python3dist-gnuhealth-icu \
python3dist-gnuhealth-imaging \
python3dist-gnuhealth-inpatient \
python3dist-gnuhealth-inpatient-calendar \
python3dist-gnuhealth-insurance \
python3dist-gnuhealth-iss \
python3dist-gnuhealth-lab \
python3dist-gnuhealth-lifestyle \
python3dist-gnuhealth-mdg6 \
python3dist-gnuhealth-ntd \
python3dist-gnuhealth-ntd-chagas \
python3dist-gnuhealth-ntd-dengue \
python3dist-gnuhealth-nursing \
python3dist-gnuhealth-ophthalmology \
python3dist-gnuhealth-pediatrics \
python3dist-gnuhealth-pediatrics-growth-charts \
python3dist-gnuhealth-pediatrics-growth-charts-who \
python3dist-gnuhealth-profile \
python3dist-gnuhealth-qrcodes \
python3dist-gnuhealth-reporting \
python3dist-gnuhealth-services \
python3dist-gnuhealth-services-imaging \
python3dist-gnuhealth-services-lab \
python3dist-gnuhealth-socioeconomics \
python3dist-gnuhealth-stock \
python3dist-gnuhealth-surgery \
python3dist-gnuhealth-webdav3-server \
python3dist-gnuhealth-who-essential-medicines"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
bsdtar \
gnu-free-fonts \
proteus \
python-abi \
python3-Pillow \
python3-PyWebDAV3-GNUHealth \
python3-caldav \
python3-hl7apy \
python3-ldap3 \
python3-matplotlib \
python3-passlib \
python3-pyBarcode \
python3-qrcode \
python3-simpleeval \
python3-six \
python3-vobject \
trytond \
trytond-account \
trytond-account-invoice \
trytond-account-invoice-stock \
trytond-account-product \
trytond-company \
trytond-country \
trytond-currency \
trytond-party \
trytond-product \
trytond-purchase \
trytond-purchase-request \
trytond-stock \
trytond-stock-lot \
trytond-stock-supply"

inherit rpm
