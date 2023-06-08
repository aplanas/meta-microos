SUMMARY = "Tool to switch between crypto policies"
DESCRIPTION = "This package provides a tool update-crypto-policies, which applies \
the policies provided by the crypto-policies package. These can be \
either the pre-built policies from the base package or custom policies \
defined in simple policy definition files."
LICENSE = "LGPL-2.1-or-later"

PV = "20210917.c9d86d1"

RPM_NAME = "crypto-policies-scripts-20210917.c9d86d1-1.14.noarch.rpm"
RPM_HASH = "98ae56bf3e9aaeee7b18f346e273ee733277883bc5dbdc2b035cdb378a75b4012c883cd270b7d711b9a17b2a93a8f2649eaa30511049435e93e622548973b0ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crypto-policies-scripts"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/sh crypto-policies"

inherit rpm
