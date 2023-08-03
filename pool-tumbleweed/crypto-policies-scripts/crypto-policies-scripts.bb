SUMMARY = "Tool to switch between crypto policies"
DESCRIPTION = "This package provides a tool update-crypto-policies, which applies \
the policies provided by the crypto-policies package. These can be \
either the pre-built policies from the base package or custom policies \
defined in simple policy definition files. \
 \
The package also provides a tool fips-mode-setup, which can be used \
to enable or disable the system FIPS mode."
LICENSE = "LGPL-2.1-or-later"

PV = "20230614.5f3458e"

RPM_NAME = "crypto-policies-scripts-20230614.5f3458e-1.1.noarch.rpm"
RPM_HASH = "94b13b97c8da0fc4a192892dc86e7ce97b30cf59b1e3caacda0043570d92f43bff7474c7554217b866f3d29f14801322378b490c436c12f1b76558c71bf75bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crypto-policies-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
crypto-policies"

inherit rpm
