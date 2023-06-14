SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-moto-4.1.0-1.5.noarch.rpm"
RPM_HASH = "2b1886a05359bdae1a86aecea69c81d86d2057c8095f3de03a19a7ecddc1c3ddb87dc1336554e42f69e7c3873685735826536176deb61399b230327414372fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-moto \
python311-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python311-python-dateutil >= 2.1 with python311-python-dateutil < 3 \
/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Jinja2 \
python311-Werkzeug \
python311-boto3 \
python311-botocore \
python311-cryptography \
python311-requests \
python311-responses \
python311-xmltodict \
update-alternatives"

inherit rpm
