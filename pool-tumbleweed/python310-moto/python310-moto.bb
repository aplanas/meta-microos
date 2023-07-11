SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-4.1.0-1.7.noarch.rpm"
RPM_HASH = "dce725ae14d77bf160aecc0472ab49d144351b4764ec8822a03fe4ec46eedb643d0eaed9c955d702fcbd393d0965f4574961545624d6d314397083acb4cfa4db"
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
