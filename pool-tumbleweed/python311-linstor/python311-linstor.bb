SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python311-linstor-1.12.0-1.7.aarch64.rpm"
RPM_HASH = "ace0eb91b6da59704481314f8add0ad891b270c1981e7d9a8fe553493e8f5c0ac55bfd5d6d49bd70cb2aa60c80f32896ea9115f1a236e7ab8c6a590ab843ac39"

RPROVIDES:${PN} += "python3-linstor \
python3.11dist-python-linstor \
python311-linstor \
python3dist-python-linstor"

RDEPENDS:${PN} += "python-abi \
python311-protobuf"

inherit rpm
