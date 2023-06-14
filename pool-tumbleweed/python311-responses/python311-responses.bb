SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python311-responses-0.23.1-2.1.noarch.rpm"
RPM_HASH = "5af8b26ab12b062a11772fec4ef4ea6d1772dfcc25a64287366a016e68ae6f76184373fc1a2f954757786dcee26c0914adcae6c95783f308832fbaad3c127d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-responses \
python311-responses \
python3dist-responses"

RDEPENDS:${PN} += "-python311-requests >= 2.22.0 with python311-requests < 3 \
python-abi \
python311-PyYAML \
python311-urllib3"

inherit rpm
