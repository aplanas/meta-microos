SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-4.1.0-1.7.noarch.rpm"
RPM_HASH = "2850066ff71283383d3447aaaf48247d494bce1b79289a56f2d208b5cf53d5dfa3775579134c9caf232ef9ab77a41f71bb213c0af79f7094cc9d235455f380a4"
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
