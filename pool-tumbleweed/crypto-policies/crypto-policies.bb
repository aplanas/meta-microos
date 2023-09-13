SUMMARY = "System-wide crypto policies"
DESCRIPTION = "This package provides pre-built configuration files with \
cryptographic policies for various cryptographic back-ends, \
such as SSL/TLS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "20230614.5f3458e"

RPM_NAME = "crypto-policies-20230614.5f3458e-2.1.noarch.rpm"
RPM_HASH = "bd1e009f8008e1b65af7d1b3f144d5d5bc820451a8fb855362c06bbc9b44d268ba0f3d5f2c49d429be1b72a3c1885773c76a1b1e33a913ae7408cff6bfe3d44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crypto-policies \
crypto-policies"

RDEPENDS:${PN} += ""

inherit rpm
