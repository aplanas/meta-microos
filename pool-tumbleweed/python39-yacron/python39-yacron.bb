SUMMARY = "Docker-friendly Cron replacement"
DESCRIPTION = "A modern Cron replacement that is Docker-friendly."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python39-yacron-0.17.0-1.7.noarch.rpm"
RPM_HASH = "412d774905d6092d2632afaf5a4bba766de6b802fe4b9c145fb032daa084e65302b8e19d7457412507e5565c5e29b1548088768fe5cf31d4fa71a53cdc97e3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yacron \
python39-yacron \
python3dist-yacron"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-aiohttp \
python39-aiosmtplib \
python39-crontab \
python39-pytz \
python39-ruamel.yaml \
python39-sentry-sdk \
python39-strictyaml \
update-alternatives"

inherit rpm
