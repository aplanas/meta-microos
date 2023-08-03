SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python39-moto-4.1.13-1.1.noarch.rpm"
RPM_HASH = "2a71d3211afe48143544b7aeee5c6b4fca3336c171f7313eec7fe3b05103879a64ea477b4b1847f8daeea51fedee561135490b0ab52be6300b7a2e58be8b5780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moto \
python39-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-Werkzeug \
python39-boto3 \
python39-botocore \
python39-cryptography \
python39-requests \
python39-responses \
python39-xmltodict \
update-alternatives"

inherit rpm
