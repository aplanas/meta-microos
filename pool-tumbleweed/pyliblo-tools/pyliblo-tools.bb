SUMMARY = "Tools for python-pyliblo"
DESCRIPTION = "This package contains command-line tools from python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "pyliblo-tools-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "148c796d80e63320155cd32465bce98e84e09c31bdcbd857aa56e007fd6628d7ddbdbedcf215f8d4d7bb17eaf83df43d04d583421708be9058575e95e2a8f70c"

RPROVIDES:${PN} += "pyliblo-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-pyliblo"

inherit rpm
