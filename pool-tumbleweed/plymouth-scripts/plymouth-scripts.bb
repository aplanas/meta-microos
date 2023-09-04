SUMMARY = "Plymouth related scripts"
DESCRIPTION = "This package contains scripts that help integrate Plymouth with \
the system."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-scripts-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "459a632210e0fef8defe3960f450afdd94dfe95ab91b0a245c021f356cbc4483e6b4fe7e32bfdd8c58ec51323ee5c9bda68fa6041a49753566c456e6754a9005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
dracut \
grep \
plymouth \
sed"

inherit rpm
