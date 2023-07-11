SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-moto-4.1.0-1.7.noarch.rpm"
RPM_HASH = "48003e697ae2ad88debce722709c87307fef2f395cef39ac0c04b8960e35bd985d244e9c6e0cce6b661ddef6cc506339a64dfa01e6539b4ad79ed62ee6384a5e"
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
