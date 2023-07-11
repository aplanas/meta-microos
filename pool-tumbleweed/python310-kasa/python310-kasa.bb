SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "python310-kasa-0.5.1-1.5.noarch.rpm"
RPM_HASH = "5f9eefbaa465a07ba4b2cc189bbf50da702c9430f9074c6c6018d08bd161ea9e9c54b0a7362d2f0eb2ce6c3edcddf1556193dd2c3c68817f153d4148a0768b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-kasa \
python310-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-anyio \
python310-asyncclick \
python310-pydantic \
python310-setuptools \
python310-voluptuous \
python310-xdoctest \
update-alternatives"

inherit rpm
