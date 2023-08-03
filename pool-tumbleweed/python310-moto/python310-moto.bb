SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python310-moto-4.1.13-1.1.noarch.rpm"
RPM_HASH = "0897ac597a501c735221d2c70e28426c26839221172d5b249ea5ae8565ddea8a0e9c5d1c113bc60de7c11def381675a1b4450fad553703a500c7197ebfc21c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-moto \
python310-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python310-python-dateutil >= 2.1 with python310-python-dateutil < 3 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-Werkzeug \
python310-boto3 \
python310-botocore \
python310-cryptography \
python310-requests \
python310-responses \
python310-xmltodict \
update-alternatives"

inherit rpm
