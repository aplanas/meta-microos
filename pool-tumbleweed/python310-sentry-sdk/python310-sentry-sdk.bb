SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.28.1"

RPM_NAME = "python310-sentry-sdk-1.28.1-1.1.noarch.rpm"
RPM_HASH = "b03844b4b6a285d8e0ca2828cd6c8897d2ea9c5a232a9e0f0c98a053db29c35db17b7c808df7bf93370adb12e2c3e252cbaadde0789053351e372d279e427529"
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
python310-grpcio \
python310-httpx \
python310-jsonschema \
python310-loguru \
python310-pymongo \
python310-rq \
python310-starlette \
python310-tornado \
python310-urllib3"

inherit rpm
