SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.24.0"

RPM_NAME = "python311-sentry-sdk-1.24.0-2.3.noarch.rpm"
RPM_HASH = "f51b8f35c3f358273c548cf350b863f8f27933b7b608c4b09d28ec8f486f50ed4cd60a9a2a1a3358837e9cf65aa15c910f309e7c96abfec50b1526342438f19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sentry-sdk \
python3.11dist-sentry-sdk \
python311-sentry-sdk \
python3dist-sentry-sdk"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Flask \
python311-SQLAlchemy \
python311-aiohttp \
python311-asttokens \
python311-blinker \
python311-bottle \
python311-celery \
python311-certifi \
python311-executing \
python311-falcon \
python311-httpx \
python311-jsonschema \
python311-pymongo \
python311-rq \
python311-starlette \
python311-tornado \
python311-urllib3"

inherit rpm
