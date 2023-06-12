SUMMARY = "Tool to switch between crypto policies"
DESCRIPTION = "This package provides a tool update-crypto-policies, which applies \
the policies provided by the crypto-policies package. These can be \
either the pre-built policies from the base package or custom policies \
defined in simple policy definition files."
LICENSE = "LGPL-2.1-or-later"

PV = "20230420.3d08ae7"

RPM_NAME = "crypto-policies-scripts-20230420.3d08ae7-1.1.noarch.rpm"
RPM_HASH = "c12b5b56e315ff377256d689e67be5c7d54f76623a0d73d16ff6da50d233367abc67133f5b14445c6224b7819d4856073c4c1550c2c625d4afb00cae0b69f54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crypto-policies-scripts"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
/usr/bin/sh \
crypto-policies"

inherit rpm
