SUMMARY = "System-wide crypto policies"
DESCRIPTION = "This package provides pre-built configuration files with \
cryptographic policies for various cryptographic back-ends, \
such as SSL/TLS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "20230420.3d08ae7"

RPM_NAME = "crypto-policies-20230420.3d08ae7-1.4.noarch.rpm"
RPM_HASH = "c832a4745175dcda6104f5a94a6380949d0840a81369f633c0676ec66f28c1ed3f63e95f0dfc9ef85ff7d2c51e61d9aaf6c6dec1efdc51c17bc37269718f4346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crypto-policies \
crypto-policies"

RDEPENDS:${PN} += ""

inherit rpm
