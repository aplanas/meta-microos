SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python310-rtslib-fb-2.1.75-3.3.noarch.rpm"
RPM_HASH = "be13e7baaa607aec5db6cb00c4bd345266bb7c97a8a5ed98afeca06c5afdba3cad1cc2e74335084e65bd7a1c4b312430c667bf2bbae4004b67eb8ea3ec6d236f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rtslib-fb \
python310-rtslib \
python310-rtslib-fb \
python3dist-rtslib-fb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python-rtslib-fb-common \
python310-pyudev"

inherit rpm
