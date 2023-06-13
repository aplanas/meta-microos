SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.24.0"

RPM_NAME = "python310-sentry-sdk-1.24.0-1.1.noarch.rpm"
RPM_HASH = "3e158b43d3d43bd6d4172772fa37227c2ab6494e5284619b42e8cdc08c19ab965982963af18956c8c21f7f1ffda5dcb0279a28c90a2ada92f808a3202b89a376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sentry-sdk \
python3.10dist(sentry-sdk) \
python310-sentry-sdk \
python3dist(sentry-sdk)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-Flask \
python310-SQLAlchemy \
python310-aiohttp \
python310-asttokens \
python310-blinker \
python310-bottle \
python310-celery \
python310-certifi \
python310-executing \
python310-falcon \
python310-httpx \
python310-jsonschema \
python310-pymongo \
python310-rq \
python310-starlette \
python310-tornado \
python310-urllib3"

inherit rpm
