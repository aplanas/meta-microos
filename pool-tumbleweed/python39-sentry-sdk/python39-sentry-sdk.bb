SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.28.1"

RPM_NAME = "python39-sentry-sdk-1.28.1-1.1.noarch.rpm"
RPM_HASH = "a02f31382858c7491a6dae034878af0a1e2d0c11db1efcc80933c015b88927b0b20bf0d11beef82c3365487d89435b8fd63c7e4b2b3b0fb894f2acce7c263548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sentry-sdk \
python39-sentry-sdk \
python3dist-sentry-sdk"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Flask \
python39-SQLAlchemy \
python39-aiohttp \
python39-asttokens \
python39-blinker \
python39-bottle \
python39-celery \
python39-certifi \
python39-executing \
python39-falcon \
python39-grpcio \
python39-httpx \
python39-jsonschema \
python39-loguru \
python39-pymongo \
python39-rq \
python39-starlette \
python39-tornado \
python39-urllib3"

inherit rpm
