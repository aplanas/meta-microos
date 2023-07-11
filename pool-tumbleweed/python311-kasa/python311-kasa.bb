SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "python311-kasa-0.5.1-1.5.noarch.rpm"
RPM_HASH = "1cfaea64d7c7878baa7bed63adc6ed7eca5fc2896cb9bc33b3dac84d0217e1da87e6f2b7eb45151a262d9dbec36f175fdf8f54ac241b610401090bc559ea3662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kasa \
python3.11dist-python-kasa \
python311-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-anyio \
python311-asyncclick \
python311-pydantic \
python311-setuptools \
python311-voluptuous \
python311-xdoctest \
update-alternatives"

inherit rpm
