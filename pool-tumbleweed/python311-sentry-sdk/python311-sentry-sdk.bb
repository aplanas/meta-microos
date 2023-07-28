SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.28.1"

RPM_NAME = "python311-sentry-sdk-1.28.1-1.1.noarch.rpm"
RPM_HASH = "115906b8f7617f4648a2275fa7479d18c0587290129e071798a5b6a73ccd13e6678bc032ebe461ea077f49891a3ee6e1fac817535c4d4195a7712de177d34e65"
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
python311-grpcio \
python311-httpx \
python311-jsonschema \
python311-loguru \
python311-pymongo \
python311-rq \
python311-starlette \
python311-tornado \
python311-urllib3"

inherit rpm
