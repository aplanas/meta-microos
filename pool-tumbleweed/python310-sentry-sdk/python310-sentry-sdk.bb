SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.24.0"

RPM_NAME = "python310-sentry-sdk-1.24.0-2.3.noarch.rpm"
RPM_HASH = "de10f9d36dd41eae6959f68ee32d7811ccb29f23570f9b5769eb26d8d7dd819f810080ec216e47c53ad1580b8dad38768dc8cb7ccef60f81ae44b74bd404abad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sentry-sdk \
python310-sentry-sdk \
python3dist-sentry-sdk"

RDEPENDS:${PN} += "python-abi \
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
