SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "python39-kasa-0.5.1-1.5.noarch.rpm"
RPM_HASH = "1c0fd27207f89f171b3f5aba6c5641c55f6b0b86911d683aa044317375db2924a16ce67ead57db515f8b9a8bbfd79cc268f4ba59568cc7c03a69e2069601f2ff"
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
