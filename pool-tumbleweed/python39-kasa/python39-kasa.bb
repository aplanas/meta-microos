SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "python39-kasa-0.5.1-1.3.noarch.rpm"
RPM_HASH = "4cd5538a4620db67ff2f10632ff0f6e8a59556ff1acb7f61927fcc3ec87b02d027559420e4afd520f8393e1538343b9a00b440186372e7582438fab33dd5421b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-kasa \
python39-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-anyio \
python39-asyncclick \
python39-pydantic \
python39-setuptools \
python39-voluptuous \
python39-xdoctest \
update-alternatives"

inherit rpm
