SUMMARY = "Docker-friendly Cron replacement"
DESCRIPTION = "A modern Cron replacement that is Docker-friendly."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python39-yacron-0.17.0-1.5.noarch.rpm"
RPM_HASH = "e40606e1e0202bc3837d1f9ff12216ad0150c488e43c1485afd4b4891c644a149526e37847cc825fa6828f12c9aee7745c04d731adb912d69ba853466ac5ece2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yacron) \
python39-yacron \
python3dist(yacron)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
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
