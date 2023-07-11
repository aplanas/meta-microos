SUMMARY = "Utilities for using the EFS file systems"
DESCRIPTION = "This package provides utilities for using the EFS file systems."
LICENSE = "MIT"

PV = "1.35.0"

RPM_NAME = "aws-efs-utils-1.35.0-1.2.noarch.rpm"
RPM_HASH = "f11f2c27de4dd21e5d96411eb7d7e8d3dcf69b9ea8e2026a1eed041c9c45c2b7b9f7c07800e4fc3567e2b8f3720a09f3d737306773aeac5a0f5587a58dbeef76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-efs-utils \
config-aws-efs-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
nfs-utils \
stunnel"

inherit rpm
