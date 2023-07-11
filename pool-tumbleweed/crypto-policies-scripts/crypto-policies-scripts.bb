SUMMARY = "Tool to switch between crypto policies"
DESCRIPTION = "This package provides a tool update-crypto-policies, which applies \
the policies provided by the crypto-policies package. These can be \
either the pre-built policies from the base package or custom policies \
defined in simple policy definition files."
LICENSE = "LGPL-2.1-or-later"

PV = "20230420.3d08ae7"

RPM_NAME = "crypto-policies-scripts-20230420.3d08ae7-1.4.noarch.rpm"
RPM_HASH = "580a03200e697054bae299c6d18d60f4cc3834570b16c46eed33997eacaaf6bd9795aa39b6c8c5b03cdb300203d7ab46a5616e5cc411763bb2ae478e81f9e047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crypto-policies-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
crypto-policies"

inherit rpm
