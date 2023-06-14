SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "python39-pymetar-1.1-2.13.noarch.rpm"
RPM_HASH = "8384d167738df0700b8a85c67765f02cad72fcb7b125c72ba80b3a6e52c4abee9f91715eed622e7c4450b5697db1e28d44f60c6c208438d5522dd45c3ae16356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymetar \
python39-pymetar \
python3dist-pymetar"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
