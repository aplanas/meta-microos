SUMMARY = "Docker-friendly Cron replacement"
DESCRIPTION = "A modern Cron replacement that is Docker-friendly."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python310-yacron-0.17.0-1.7.noarch.rpm"
RPM_HASH = "10fd70b74a726cc67773b29afccf94a5ccd1fc77353cd6aaaca220c51a60489a4f9dccc08eb578839921bd2d62a49e90aaefff57e5737125a7295e29d322a802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yacron \
python310-yacron \
python3dist-yacron"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-aiohttp \
python310-aiosmtplib \
python310-crontab \
python310-pytz \
python310-ruamel.yaml \
python310-sentry-sdk \
python310-strictyaml \
update-alternatives"

inherit rpm
