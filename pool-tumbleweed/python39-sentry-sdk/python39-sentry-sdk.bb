SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.24.0"

RPM_NAME = "python39-sentry-sdk-1.24.0-2.3.noarch.rpm"
RPM_HASH = "93f3686dc2c621fd33dad3caa4b224b8c6c44bb20e2dd6de9393000004e3434d4e6c7d543f51f91592ab870c83a967341c456cd97bf4d6442a310b7ac1ac9513"
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
python39-httpx \
python39-jsonschema \
python39-pymongo \
python39-rq \
python39-starlette \
python39-tornado \
python39-urllib3"

inherit rpm
