SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python311-moto-4.1.13-1.1.noarch.rpm"
RPM_HASH = "fc70892b9313a1af09627c22a5c082382698153fc5ea9a84ec45000f0946de2f038f35fdf14e2312cdb5c15b0c96399746dc74fdd8879c337891baa3df44b07b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto \
python3.11dist-moto \
python311-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python311-python-dateutil >= 2.1 with python311-python-dateutil < 3 \
/usr/bin/python3.11 \
/usr/bin/sh \
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
