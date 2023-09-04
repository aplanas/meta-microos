SUMMARY = "Tools for python-pyliblo"
DESCRIPTION = "This package contains command-line tools from python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "pyliblo-tools-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "6e7c1f9002d07378490f523fb6abeb0d71c5fc3e57ed30134386334f7802c3d5cc96dfe44552c66bbc45fb3523a6a8f5bd1cd62972a38416aa610f21495cf326"

RPROVIDES:${PN} += "pyliblo-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-pyliblo"

inherit rpm
