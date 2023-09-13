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

RPM_NAME = "crypto-policies-scripts-20230614.5f3458e-2.1.noarch.rpm"
RPM_HASH = "95977bce7e10b90ada6bbaacaa6ba99f567e0af154164d72260242bb33f0fd425cbb345ab072f2e8c4b3949e2f01090d1ce31bcb84529cba63c85d163fb901bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crypto-policies-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
crypto-policies"

inherit rpm
