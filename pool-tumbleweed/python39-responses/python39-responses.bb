SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python39-responses-0.23.1-2.3.noarch.rpm"
RPM_HASH = "f3e22cb3b65e786d673c703b7572e611358a3b75ea3afc67cf7e3bad3b6e8126bb1e94f3707a7d297f7db1ca8a8e17bf809d555c0e0d91da64f57d948002e2db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-responses \
python39-responses \
python3dist-responses"

RDEPENDS:${PN} += "-python39-requests >= 2.22.0 with python39-requests < 3 \
python-abi \
python39-PyYAML \
python39-urllib3"

inherit rpm
