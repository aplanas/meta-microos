SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python311-responses-0.23.1-2.3.noarch.rpm"
RPM_HASH = "6a44b2457eb3c5b1e4203d46d68cea519618045154d9cae21eff23414ad7ee7d5068f08ff235ef9307498f3a93565280818da3f29f09022281e8fbd93fc23d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-responses \
python3.11dist-responses \
python311-responses \
python3dist-responses"

RDEPENDS:${PN} += "-python311-requests >= 2.22.0 with python311-requests < 3 \
python-abi \
python311-PyYAML \
python311-urllib3"

inherit rpm
