SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-4.1.0-1.5.noarch.rpm"
RPM_HASH = "46e30a49c789b5b63331dbcdf3e2e010136969d12a0b9cd9e5e13123fe6240d9f4f1b4d081ead83bc7c18d9c1edbde9892e671b296ec7081f757fad85534ad84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moto \
python39-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3 \
/bin/sh \
/usr/bin/python3.9 \
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
