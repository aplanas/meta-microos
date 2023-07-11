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

RPM_NAME = "gnuhealth-4.2.1-1.3.noarch.rpm"
RPM_HASH = "595bb4d08cfff30a6862b0ef6c7933633dbfd7dd168c6662778a0c3f2e4959ab1d5c96954b38bb0d264c0cea31cc2c5743a6be41de4dad4d087b02e1e11aa1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth \
python3.11dist-gnuhealth \
python3.11dist-gnuhealth-archives \
python3.11dist-gnuhealth-caldav \
python3.11dist-gnuhealth-calendar \
python3.11dist-gnuhealth-contact-tracing \
python3.11dist-gnuhealth-crypto \
python3.11dist-gnuhealth-crypto-lab \
python3.11dist-gnuhealth-dentistry \
python3.11dist-gnuhealth-disability \
python3.11dist-gnuhealth-ems \
python3.11dist-gnuhealth-federation \
python3.11dist-gnuhealth-genetics \
python3.11dist-gnuhealth-genetics-uniprot \
python3.11dist-gnuhealth-gyneco \
python3.11dist-gnuhealth-history \
python3.11dist-gnuhealth-icd10 \
python3.11dist-gnuhealth-icd10pcs \
python3.11dist-gnuhealth-icd11 \
python3.11dist-gnuhealth-icd9procs \
python3.11dist-gnuhealth-icpm \
python3.11dist-gnuhealth-icu \
python3.11dist-gnuhealth-imaging \
python3.11dist-gnuhealth-inpatient \
python3.11dist-gnuhealth-inpatient-calendar \
python3.11dist-gnuhealth-insurance \
python3.11dist-gnuhealth-iss \
python3.11dist-gnuhealth-lab \
python3.11dist-gnuhealth-lifestyle \
python3.11dist-gnuhealth-mdg6 \
python3.11dist-gnuhealth-ntd \
python3.11dist-gnuhealth-ntd-chagas \
python3.11dist-gnuhealth-ntd-dengue \
python3.11dist-gnuhealth-nursing \
python3.11dist-gnuhealth-ophthalmology \
python3.11dist-gnuhealth-pediatrics \
python3.11dist-gnuhealth-pediatrics-growth-charts \
python3.11dist-gnuhealth-pediatrics-growth-charts-who \
python3.11dist-gnuhealth-profile \
python3.11dist-gnuhealth-qrcodes \
python3.11dist-gnuhealth-reporting \
python3.11dist-gnuhealth-services \
python3.11dist-gnuhealth-services-imaging \
python3.11dist-gnuhealth-services-lab \
python3.11dist-gnuhealth-socioeconomics \
python3.11dist-gnuhealth-stock \
python3.11dist-gnuhealth-surgery \
python3.11dist-gnuhealth-webdav3-server \
python3.11dist-gnuhealth-who-essential-medicines \
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

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
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
