SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "python310-kasa-0.5.1-1.3.noarch.rpm"
RPM_HASH = "189223e41d4b91aa630b4e3c034c7b227b569a8df0013016afaca1ec5ea32ee926cd5ec3f0e9856532ed62105d70187fe64424a05334792a0566aaf5beeaa7ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kasa \
python3.10dist-python-kasa \
python310-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-anyio \
python310-asyncclick \
python310-pydantic \
python310-setuptools \
python310-voluptuous \
python310-xdoctest \
update-alternatives"

inherit rpm
