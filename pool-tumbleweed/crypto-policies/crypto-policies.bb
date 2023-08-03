SUMMARY = "System-wide crypto policies"
DESCRIPTION = "This package provides pre-built configuration files with \
cryptographic policies for various cryptographic back-ends, \
such as SSL/TLS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "20230614.5f3458e"

RPM_NAME = "crypto-policies-20230614.5f3458e-1.1.noarch.rpm"
RPM_HASH = "a2635fe84b1788436e6a806befc180c3fc6670a1493b4dfba60c48ca722aead457a224cf0386b7cb99560cd8f0b6473fc520adf8434c377f52c6fef8ff1714ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crypto-policies \
crypto-policies"

RDEPENDS:${PN} += ""

inherit rpm
