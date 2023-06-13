SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python39-rtslib-fb-2.1.75-3.1.noarch.rpm"
RPM_HASH = "7b84cfe496c06e37207157e182feba504c3e5befe8156c527051a3e0ce18c9319f7d76c820f8b881f1d01ae46cc977ad172cb96b007c788516f3bd3aa49a3925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rtslib-fb) \
python39-rtslib \
python39-rtslib-fb \
python3dist(rtslib-fb)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python-rtslib-fb-common \
python39-pyudev"

inherit rpm
