SUMMARY = "Docker-friendly Cron replacement"
DESCRIPTION = "A modern Cron replacement that is Docker-friendly."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python311-yacron-0.17.0-1.7.noarch.rpm"
RPM_HASH = "d59eed63995be9983612afb1b4551462d54904716444cd684e32ee898ff9c5d01fc3093d7bfc408f208e8d34013ab2180598589990543f3aeefd667893bd167c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yacron \
python3.11dist-yacron \
python311-yacron \
python3dist-yacron"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-aiohttp \
python311-aiosmtplib \
python311-crontab \
python311-pytz \
python311-ruamel.yaml \
python311-sentry-sdk \
python311-strictyaml \
update-alternatives"

inherit rpm
