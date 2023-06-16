SUMMARY = "Source code of Universal Data Plane API"
DESCRIPTION = "This package contains source code of Universal Data Plane API"
LICENSE = "Apache-2.0"

PV = "0.0.1"

RPM_NAME = "udpa-source-0.0.1-1.7.noarch.rpm"
RPM_HASH = "5e2eba1e1cea8b1bc91b832dd3307dd48d752223677f6c6ce2cfd9847c48a151e74a95a3d37ca6eeb3de8ec2d07a4f17bf5b1ad4ac6580732ebf95c910d76db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udpa-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3"

inherit rpm
