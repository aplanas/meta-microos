SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python311-rtslib-fb-2.1.75-3.3.noarch.rpm"
RPM_HASH = "67308e3ba0939337a2ce5a3d6f87603c471470a0ed2c19f163265f611680ee6ea5e3f091fe7782351ed3dc308a624a0682fee38a6b8e09f4c7bd39da3f6acf82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rtslib \
python3-rtslib-fb \
python3.11dist-rtslib-fb \
python311-rtslib \
python311-rtslib-fb \
python3dist-rtslib-fb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python-rtslib-fb-common \
python311-pyudev"

inherit rpm
