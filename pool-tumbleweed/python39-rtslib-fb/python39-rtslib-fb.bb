SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python39-rtslib-fb-2.1.75-3.3.noarch.rpm"
RPM_HASH = "2753d703447ac8d0a2ec845cb2bd6052ed6b1a75a853d871c44944445a5e450538465aff09a6105ae4cd79a95136210d72bff7c333d48cfa7e1c14785e563126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rtslib-fb \
python39-rtslib \
python39-rtslib-fb \
python3dist-rtslib-fb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python-rtslib-fb-common \
python39-pyudev"

inherit rpm
