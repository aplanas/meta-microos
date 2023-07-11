SUMMARY = "File compression program"
DESCRIPTION = "Zip is a compression and file packaging utility. It is compatible with \
PKZIP(tm) 2.04g (Phil Katz ZIP) for MS-DOS systems."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "zip-3.0-22.6.aarch64.rpm"
RPM_HASH = "a9b5451380d759faa868676edd9c40f39722f6a830341815bb08f00bfb34343a8e49296b34531713abc40d38d9148189dbbe56e39cc1b6f98311d9444373fc53"

RPROVIDES:${PN} += "crzip \
zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
