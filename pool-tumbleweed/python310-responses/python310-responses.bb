SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python310-responses-0.23.1-2.3.noarch.rpm"
RPM_HASH = "2395653aa6770dd2c06a25807c7d5de24fdcefc6894795774e2a3308d6626a5ee06b63c924042881cab100e7ea65f4270f8169f14a53601b4a7972a301c7fdc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-responses \
python310-responses \
python3dist-responses"

RDEPENDS:${PN} += "-python310-requests >= 2.22.0 with python310-requests < 3 \
python-abi \
python310-PyYAML \
python310-urllib3"

inherit rpm
