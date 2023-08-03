SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-docs-3.1.6-2.1.noarch.rpm"
RPM_HASH = "0e531cc4807d3df2c7a5aa921f27762ca6aba0c90848150a884a88b934f7a0664021d8ce5a1de04993cfa112eeb6ad3142147bab86135ce430ee5d40c18fd81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"

RDEPENDS:${PN} += ""

inherit rpm
