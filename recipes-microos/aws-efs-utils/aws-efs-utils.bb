SUMMARY = "Utilities for using the EFS file systems"
DESCRIPTION = "This package provides utilities for using the EFS file systems."
LICENSE = "MIT"

PV = "1.35.0"

RPM_NAME = "aws-efs-utils-1.35.0-1.1.noarch.rpm"
RPM_HASH = "1cc07d3689c48a041510749a337b4752ba40a5977fc9b70cf83a89b5eaaa1a8b66756606977888fd863ec769f89e948372fb17149d8ca50a0c0d0265f0098540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-efs-utils \
config(aws-efs-utils)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
nfs-utils \
stunnel"

inherit rpm
