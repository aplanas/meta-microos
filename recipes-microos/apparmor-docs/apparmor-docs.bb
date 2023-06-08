SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "apparmor-docs-3.1.3-2.1.noarch.rpm"
RPM_HASH = "6f0938daec3f180c9d68d5e2621c9f1effe23304d59b2ccdead6285c29f9d240f2c2ae1587577d85af059a52bf2fee2bd630020d974d6327b71102159d4f80da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"
RDEPENDS:${PN} += ""

inherit rpm
